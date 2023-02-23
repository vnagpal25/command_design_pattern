import java.util.concurrent.TimeUnit;
/**
 * A class to represent a stopwatch
 * @author Jagger
 */
public class StopWatch {
    public StopWatch() {
        
    }
    private void countDown(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        for (int i = 0; i < seconds; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            if (minutes < 10) {
                System.out.print("0" + minutes + ":");
            } else {
                System.out.print(minutes + ":");
            }
            if (remainingSeconds < 10) {
                System.out.println("0" + remainingSeconds);
            } else {
                System.out.println(remainingSeconds);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            remainingSeconds--;
            if (remainingSeconds < 0) {
                minutes--;
                remainingSeconds = 59;
            }
        }
        
    }
    public void countDownOneMin() {
        countDown(60);
    }
    /**
     * Starts a timer for five minutes
     */
    public void countDownFiveMin() {
        countDown(300);
    }
    /**
     * Starts a timer for thirty seconds
     */
    public void countDownThirtySec() {
        countDown(30);
    }
}

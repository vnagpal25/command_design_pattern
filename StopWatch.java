import java.util.concurrent.TimeUnit;
/**
 * A class to represent a stopwatch
 * @author Jagger
 */
public class StopWatch {
    /**
     * Creates a new StopWatch
     */
    public StopWatch() {
        
    }
    /**
     * A helper method to convert seconds to minutes and seconds and then count down
     * @param time
     */
    private void helper(int time) {
        for (int i = time; i >= 0; i--) {
            int minutes = i / 60;
            int seconds = i % 60;
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("0"+minutes+":");
            if (i == 0) {
                System.out.println("00");
            } else if (i < 10) {
                System.out.println("0" + seconds);
            } else {
                System.out.println(seconds);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * Starts a timer for one minute
     */
    public void countDownOneMin() {
        helper(60);
    }
    /**
     * Starts a timer for five minutes
     */
    public void countDownFiveMin() {
        helper(300);
    }
    /**
     * Starts a timer for thirty seconds
     */
    public void countDownThirtySec() {
        helper(30);
    }
}

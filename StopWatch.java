import java.util.concurrent.TimeUnit;
/**
 * A class to represent a stopwatch
 * @author Jagger
 */
public class StopWatch {
    public StopWatch() {
        
    }
    /**
     * Starts a timer for one minute
     */
    public void countDownOneMin() {
        for (int i = 60; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("00:");
            if (i < 10) {
                System.out.println("0" + i);
            } else {
                System.out.println(i);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Starts a timer for five minutes
     */
    public void countDownFiveMin() {
        for (int i = 300; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("00:");
            if (i < 10) {
                System.out.println("0" + i);
            } else {
                System.out.println(i);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Starts a timer for thirty seconds
     */
    public void countDownThirtySec() {
        for (int i = 30; i >= 0; i--) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("00:");
            if (i < 10) {
                System.out.println("0" + i);
            } else {
                System.out.println(i);
            }
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

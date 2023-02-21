import java.util.concurrent.TimeUnit;
public class StopWatch {
    public StopWatch() {
        
    }
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

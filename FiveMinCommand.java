/**
 * This class is a command that will call on the method to
 * count down five minutes.
 * 
 * @author Scott Do (Reshlynt)
 * @version 1.0
 */
public class FiveMinCommand implements Command {
    private StopWatch watch;

    public FiveMinCommand(StopWatch watch) {
        this.watch = watch;
    }
    /**
     * This methods run the method that counts down five min
     * from 04:59, whose method appears in the StopWatch class.
     */
    public void execute() {
        watch.countDownFiveMin();
    }
}

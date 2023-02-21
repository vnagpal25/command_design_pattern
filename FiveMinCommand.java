/**
 * This class create a stopwatch that will countdown from 4:59 to 0:00.
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

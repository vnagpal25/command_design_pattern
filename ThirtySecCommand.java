/**
 * This class create a stopwatch that will countdown from 30 seconds
 * @author Pushpendra Shekhawat (shekhawp)
 * @version 1.0
 */
public class ThirtySecCommand implements Command {
    private StopWatch stopwatch;
    /**
     * Creates a Thirty Second Command object
     * @param watch a stopwatch object we will use for this class
     * 
     */
    public ThirtySecCommand(StopWatch watch) {
        this.stopwatch = watch;
    }
    /**
     * Executes a thirty second timer
     * 
     */
    public void execute() {
        this.stopwatch.countDownThirtySec();
    }
}
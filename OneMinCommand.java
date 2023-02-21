/**
 * This class creates a stopwatch that will countdown from 1:00 to 0:00.
 * @author Adam Stewart (stewys)
 */
public class OneMinCommand implements Command {
    private StopWatch watch;
    
    /**
     * OneMinCommand constructor
     * @param watch
     */
    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }
    
    /**
     * Execute the command
     */
    public void execute() {
        this.watch.countDownOneMin();
    }
}

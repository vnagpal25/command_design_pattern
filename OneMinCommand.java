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

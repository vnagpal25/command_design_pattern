public class OneMinCommand implements Command {
    private Watch watch;
    
    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }
    
    public void execute() {
        watch.oneMin();
    }
}


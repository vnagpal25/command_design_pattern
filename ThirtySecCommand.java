public class ThirtySecCommand implements Command {
    private StopWatch stopwatch;
    public ThirtySecCommand(StopWatch watch) {
        this.stopwatch = watch;
    }
    public void execute() {
        this.stopwatch.countDownThirtySec();
    }
}
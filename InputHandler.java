import java.util.HashMap;

/**
 * @author vnagpal (vnagpal25)
 *         InputHandler class
 */
public class InputHandler {
  // initializes hashmap
  private HashMap<String, Command> commands;

  /**
   * Constructor matches inputs to commands
   * 
   * @param watch given stopwatch that will be given to the commands
   */
  public InputHandler(StopWatch watch) {
    commands = new HashMap<String, Command>();
    commands.put("1", new OneMinCommand(watch));
    commands.put("5", new FiveMinCommand(watch));
    commands.put("30", new ThirtySecCommand(watch));
  }

  /**
   * Method validates input for stopwatch
   * @param data input entered in command line
   * @return boolean based on valid input 1, 5, or 30
   */
  public boolean inputEntered(String data) {
    Command command = commands.get(data);
        if (command == null)
            return false;
        command.execute();
        return true;
  }
}

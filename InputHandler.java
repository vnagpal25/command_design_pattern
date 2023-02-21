import java.util.HashMap;

public class InputHandler {
  private HashMap<String, Command> commands = new HashMap<String, Command>();

  public InputHandler(StopWatch watch){
    commands.put("1", OneMinCommand);
    commands.put("5", FiveMinCommand);
    commands.put("30", ThirtySecCommand);
  }

  public boolean inputEntered(String data) {

  }
}

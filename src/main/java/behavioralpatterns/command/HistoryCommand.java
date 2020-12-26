package behavioralpatterns.command;
// ˅
import java.util.Stack;

// ˄

// Holder of the past commands
public class HistoryCommand implements Command {
    // ˅
    
    // ˄

    // A set of past commands
    private final Stack<Command> pastCommands;

    public HistoryCommand() {
        // ˅
        this.pastCommands = new Stack<Command>();
        
        // ˄
    }

    @Override
    public void execute() {
        // ˅
        pastCommands.forEach(Command::execute);
        // ˄
    }

    public void add(Command cmd) {
        // ˅
        pastCommands.push(cmd);
        // ˄
    }

    // Delete the last command
    public void undo() {
        // ˅
        if (!pastCommands.isEmpty()) {
            pastCommands.pop();
        }
        // ˄
    }

    // Delete all past commands
    public void clear() {
        // ˅
        pastCommands.clear();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

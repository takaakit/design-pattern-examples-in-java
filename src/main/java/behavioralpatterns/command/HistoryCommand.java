package behavioralpatterns.command;
// ˅
import java.util.*;
import java.text.*;

// ˄

// Holder of the past commands
public class HistoryCommand implements Command {
    // ˅
    
    // ˄

    // A set of past commands
    private final Stack<Command> pastCommands;

    HistoryCommand() {
        // ˅
        this.pastCommands = new Stack<Command>();
        
        // ˄
    }

    @Override
    public void execute() {
        // ˅
        pastCommands.forEach(command -> command.execute());
        // ˄
    }

    public void add(Command cmd) {
        // ˅
        pastCommands.push(cmd);
        // ˄
    }

    // Delete the last command
    void undo() {
        // ˅
        if (!pastCommands.isEmpty()) {
            pastCommands.pop();
        }
        // ˄
    }

    // Delete all past commands.
    void clear() {
        // ˅
        pastCommands.clear();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

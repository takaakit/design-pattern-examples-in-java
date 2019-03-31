package behavioralpatterns.interpreter;
// ˅
import java.util.*;
import java.text.*;

// ˄

// A node corresponding to "program".
public class Program implements Node {
    // ˅
    
    // ˄

    private Node commandList;

    public Program() {
        // ˅
        this.commandList = null;
        
        // ˄
    }

    @Override
    public void parse(Context context) throws Exception {
        // ˅
        context.slideToken("program");
        commandList = new CommandList();
        commandList.parse(context);
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "[program " + commandList + "]";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

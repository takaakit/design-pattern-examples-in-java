package behavioralpatterns.interpreter;
// ˅

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

        CommandList aCommandList = new CommandList();
        aCommandList.parse(context);

        this.commandList = aCommandList;    // Hold the parsed command list
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

package behavioralpatterns.interpreter;
// ˅

// ˄

// A node corresponding to "repeat".
public class Repeat implements Node {
    // ˅
    
    // ˄

    private int number;

    private Node commandList;

    public Repeat() {
        // ˅
        this.number = 0;
        this.commandList = null;
        
        // ˄
    }

    @Override
    public void parse(Context context) throws Exception {
        // ˅
        context.slideToken("repeat");
        number = context.getNumber();
        context.nextToken();
        commandList = new CommandList();
        commandList.parse(context);
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "repeat " + number + " " + commandList;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

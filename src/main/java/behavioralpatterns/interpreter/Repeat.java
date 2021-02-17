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
        context.slideToken(Integer.toString(number));

        CommandList aCommandList = new CommandList();
        aCommandList.parse(context);

        this.commandList = aCommandList;    // Hold the parsed command list
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

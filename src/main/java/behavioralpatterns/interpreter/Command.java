package behavioralpatterns.interpreter;
// ˅

// ˄

public class Command implements Node {
    // ˅
    
    // ˄

    private Node node;

    public Command() {
        // ˅
        this.node = null;
        
        // ˄
    }

    @Override
    public void parse(Context context) throws Exception {
        // ˅
        Node aNode;
        if (context.getToken().equals("repeat")) {
            aNode = new Repeat();
            aNode.parse(context);
        }
        else {
            aNode = new Action();
            aNode.parse(context);
        }

        this.node = aNode;   // Hold the parsed node
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return node.toString();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

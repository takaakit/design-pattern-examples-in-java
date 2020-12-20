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
        if (context.getToken().equals("repeat")) {
            node = new Repeat();
            node.parse(context);
        }
        else {
            node = new Action();
            node.parse(context);
        }
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

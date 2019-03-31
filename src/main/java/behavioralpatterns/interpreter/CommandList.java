package behavioralpatterns.interpreter;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class CommandList implements Node {
    // ˅
    
    // ˄

    private final List<Node> nodes;

    public CommandList() {
        // ˅
        this.nodes = new ArrayList<>();
        
        // ˄
    }

    @Override
    public void parse(Context context) throws Exception {
        // ˅
        while (true) {
            if (context.getToken() == null) {
                throw new Exception("Missing 'end'");
            }
            else if (context.getToken().equals("end")) {
                context.slideToken("end");
                break;
            }
            else {
                Command commandNode = new Command();
                commandNode.parse(context);
                nodes.add(commandNode);
            }
        }
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return nodes.toString();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

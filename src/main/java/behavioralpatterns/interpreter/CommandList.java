package behavioralpatterns.interpreter;
// ˅
import java.util.ArrayList;
import java.util.List;

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
                Node aNode = new Command();
                aNode.parse(context);

                nodes.add(aNode);    // Hold the parsed node
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

package behavioralpatterns.interpreter;
// ˅

// ˄

// A node corresponding to "forward", "left", and "right".
public class Action implements Node {
    // ˅
    
    // ˄

    private String name;

    public Action() {
        // ˅
        this.name = null;
        
        // ˄
    }

    @Override
    public void parse(Context context) throws Exception {
        // ˅
        name = context.getToken();
        context.slideToken(name);
        if (!name.equals("forward") && !name.equals("right") && !name.equals("left")) {
            throw new Exception(name + " is unknown");
        }
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return name;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

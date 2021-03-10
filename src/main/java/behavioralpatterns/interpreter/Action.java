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
        String currentToken = context.getToken();
        if (!currentToken.equals("forward") && !currentToken.equals("right") && !currentToken.equals("left")) {
            throw new Exception(currentToken + " is unknown");
        }

        this.name = currentToken;    // Hold the current token as this action name

        context.slideToken(currentToken);
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

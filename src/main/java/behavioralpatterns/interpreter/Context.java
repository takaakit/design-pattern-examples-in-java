package behavioralpatterns.interpreter;
// ˅
import java.util.StringTokenizer;

// ˄

// Hold data which will be interpreted.
public class Context {
    // ˅
    
    // ˄

    private final StringTokenizer tokenizer;

    private String currentToken;

    public Context(String line) {
        // ˅
        this.tokenizer = new StringTokenizer(line);
        this.currentToken = null;
        nextToken();
        // ˄
    }

    public String nextToken() {
        // ˅
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        }
        else {
            currentToken = null;
        }
        return currentToken;
        // ˄
    }

    public String getToken() {
        // ˅
        return currentToken;
        // ˄
    }

    public void slideToken(String token) throws Exception {
        // ˅
        if (!token.equals(currentToken)) {
            throw new Exception("WARNING: " + token + " is expected but " + currentToken + " was found.");
        }
        nextToken();
        // ˄
    }

    public int getNumber() throws Exception {
        // ˅
        try {
            return Integer.parseInt(currentToken);
        }
        catch (NumberFormatException e) {
            throw new Exception("WARNING: " + e);
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.interpreter;
// ˅
import java.util.*;
import java.text.*;

// ˄

// Analyze the syntax
public class Context {
    // ˅
    
    // ˄

    private final StringTokenizer tokenizer;

    private String currentToken;

    public Context(String text) {
        // ˅
        this.tokenizer = new StringTokenizer(text);
        this.currentToken = null;
        nextToken();
        // ˄
    }

    String nextToken() {
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

    String getToken() {
        // ˅
        return currentToken;
        // ˄
    }

    void slideToken(String token) throws Exception {
        // ˅
        if (!token.equals(currentToken)) {
            throw new Exception("WARNING: " + token + " is expected but " + currentToken + " was found.");
        }
        nextToken();
        // ˄
    }

    public int getNumber() throws Exception {
        // ˅
        int number;
        try {
            number = Integer.parseInt(currentToken);
        }
        catch (NumberFormatException e) {
            throw new Exception("WARNING: " + e);
        }

        return number;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package structuralpatterns.adapter;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class MessageDisplay {
    // ˅
    
    // ˄

    private final String message;

    public MessageDisplay(String message) {
        // ˅
        this.message = message;
        
        // ˄
    }

    void displayWithHyphens() {
        // ˅
        System.out.println("-- " + message + " --");
        // ˄
    }

    void displayWithBrackets() {
        // ˅
        System.out.println("[[ " + message + " ]]");
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

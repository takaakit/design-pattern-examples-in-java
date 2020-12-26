package structuralpatterns.adapter;
// ˅

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

    public void displayWithHyphens() {
        // ˅
        System.out.println("-- " + message + " --");
        // ˄
    }

    public void displayWithBrackets() {
        // ˅
        System.out.println("[[ " + message + " ]]");
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package structuralpatterns.decorator;
// ˅

// ˄

public class MessageDisplay extends Display {
    // ˅
    
    // ˄

    // Message to be displayed
    private final String message;

    public MessageDisplay(String message) {
        // ˅
        this.message = message;
        
        // ˄
    }

    // Number of characters
    @Override
    public int getColumns() {
        // ˅
        return message.length();
        // ˄
    }

    // The number of rows is 1
    @Override
    public int getRows() {
        // ˅
        return 1;
        // ˄
    }

    public String getLineText(int row) {
        // ˅
        if (row == 0) {
            return message;
        }
        else {
            return null;
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

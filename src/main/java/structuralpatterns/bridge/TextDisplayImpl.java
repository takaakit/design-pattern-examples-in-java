package structuralpatterns.bridge;
// ˅

// ˄

public class TextDisplayImpl implements DisplayImpl {
    // ˅
    
    // ˄

    // A string to display
    private final String text;

    // A number of characters in bytes
    private final int width;

    public TextDisplayImpl(String text) {
        // ˅
        this.text = text;
        this.width = text.length();        // Set the number of characters in bytes.
        
        // ˄
    }

    @Override
    public void implOpen() {
        // ˅
        printLine();
        // ˄
    }

    @Override
    public void implWrite() {
        // ˅
        System.out.println(":" + text + ":");                // Enclose a text with ":" and display it.
        // ˄
    }

    @Override
    public void implClose() {
        // ˅
        printLine();
        // ˄
    }

    private void printLine() {
        // ˅
        System.out.print("*");                          // Display "*" mark at the beginning of a frame.
        for (int i = 0; i < width; i++) {               // Display "." for the number of "width".
            System.out.print(".");
        }
        System.out.print("*\n");                        // Display "*" mark at the end of a frame.
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

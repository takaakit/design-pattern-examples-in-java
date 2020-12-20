package behavioralpatterns.templatemethod;
// ˅

// ˄

public class StringDisplay extends AbstractDisplay {
    // ˅
    
    // ˄

    private final String stringValue;

    // String width
    private final int width;

    public StringDisplay(String stringValue) {
        // ˅
        this.stringValue = stringValue;
        this.width = stringValue.length();
        
        // ˄
    }

    @Override
    public void open() {
        // ˅
        writeLine();             // Write a line
        // ˄
    }

    @Override
    public void write() {
        // ˅
        System.out.println("|" + stringValue + "|");    // Display the character with "|"
        // ˄
    }

    @Override
    public void close() {
        // ˅
        writeLine();             // Write a line
        // ˄
    }

    private void writeLine() {
        // ˅
        System.out.print("+");              // Display an end mark "+"
        for (int i = 0; i < width; i++) {
            System.out.print("-");          // Display a line "-"
        }
        System.out.println("+");            // Display an end mark "+"
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

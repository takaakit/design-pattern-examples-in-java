package structuralpatterns.decorator;
// ˅

// ˄

public class FullFrame extends Frame {
    // ˅
    
    // ˄

    public FullFrame(Display display) {
        // ˅
        super(display);
        // ˄
    }

    // Number of characters added left and right decoration characters
    @Override
    public int getColumns() {
        // ˅
        return 1 + display.getColumns() + 1;
        // ˄
    }

    // Number of rows added the upper and lower decoration lines
    @Override
    public int getRows() {
        // ˅
        return 1 + display.getRows() + 1;
        // ˄
    }

    public String getLineText(int row) {
        // ˅
        if (row == 0) {
            return "+" + createLine('-', display.getColumns()) + "+";   // Upper frame
        }
        else if (row == display.getRows() + 1) {
            return "+" + createLine('-', display.getColumns()) + "+";   // Bottom frame
        }
        else {
            return "|" + display.getLineText(row - 1) + "|";       // Other
        }
        // ˄
    }

    private String createLine(char ch, int size) {
        // ˅
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buf.append(ch);
        }
        return buf.toString();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

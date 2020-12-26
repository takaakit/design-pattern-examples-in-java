package structuralpatterns.decorator;
// ˅

// ˄

public class SideFrame extends Frame {
    // ˅
    
    // ˄

    // Decoration character
    private final char frameChar;

    public SideFrame(Display display, char frameChar) {
        // ˅
        super(display);
        this.frameChar = frameChar;
        
        // ˄
    }

    // Number of characters added left and right decoration characters
    @Override
    public int getColumns() {
        // ˅
        return 1 + display.getColumns() + 1;
        // ˄
    }

    // Number of lines
    @Override
    public int getRows() {
        // ˅
        return display.getRows();
        // ˄
    }

    public String getLineText(int row) {
        // ˅
        return frameChar + display.getLineText(row) + frameChar;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

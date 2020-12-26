package structuralpatterns.bridge;
// ˅

// ˄

public class MultiLineDisplay extends Display {
    // ˅
    
    // ˄

    public MultiLineDisplay(DisplayImpl impl) {
        // ˅
        super(impl);
        // ˄
    }

    // Repeat display for the specified number of times
    public void outputMultiple(int times) {
        // ˅
        open();
        for (int i = 0; i < times; i++) {
            write();
        }
        close();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package structuralpatterns.bridge;
// ˅

// ˄

public class Display {
    // ˅
    
    // ˄

    private final DisplayImpl impl;

    public Display(DisplayImpl impl) {
        // ˅
        this.impl = impl;
        
        // ˄
    }

    public void output() {
        // ˅
        open();
        write();
        close();
        // ˄
    }

    protected void open() {
        // ˅
        impl.implOpen();
        // ˄
    }

    protected void write() {
        // ˅
        impl.implWrite();
        // ˄
    }

    protected void close() {
        // ˅
        impl.implClose();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

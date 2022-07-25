package structuralpatterns.adapter;
// ˅

// ˄

// Adapt the MessageDisplay interface to the Print interface.
public class PrintMessageDisplay extends MessageDisplay implements Print {
    // ˅
    
    // ˄

    public PrintMessageDisplay(String message) {
        // ˅
        super(message);
        // ˄
    }

    @Override
    public void printWeak() {
        // ˅
        displayWithHyphens();
        // ˄
    }

    @Override
    public void printStrong() {
        // ˅
        displayWithBrackets();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

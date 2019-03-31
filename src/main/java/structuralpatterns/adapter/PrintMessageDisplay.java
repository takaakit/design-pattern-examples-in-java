package structuralpatterns.adapter;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class PrintMessageDisplay extends MessageDisplay implements Print {
    // ˅
    
    // ˄

    PrintMessageDisplay(String message) {
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

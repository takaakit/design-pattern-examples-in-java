package structuralpatterns.decorator;
// ˅
import java.util.*;
import java.text.*;

// ˄

public abstract class Frame extends Display {
    // ˅
    
    // ˄

    protected Display display;

    protected Frame(Display display) {
        // ˅
        this.display = display;
        
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

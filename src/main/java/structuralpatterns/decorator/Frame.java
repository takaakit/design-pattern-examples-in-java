package structuralpatterns.decorator;
// ˅

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

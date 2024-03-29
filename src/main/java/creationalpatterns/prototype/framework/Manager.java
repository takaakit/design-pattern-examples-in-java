package creationalpatterns.prototype.framework;
// ˅
import java.util.HashMap;
import java.util.Map;

// ˄

public class Manager {
    // ˅
    
    // ˄

    private final Map<String, Display> display;

    public Manager() {
        // ˅
        this.display = new HashMap<>();
        
        // ˄
    }

    public void registerDisplay(String displayName, Display display) {
        // ˅
        this.display.put(displayName, display);
        // ˄
    }

    public Display getDisplay(String displayName) {
        // ˅
        Display d = display.get(displayName);
        return d.clone();       // Create a new object by asking a concrete class to clone itself. Therefore, do not need to know the concrete Display class name.
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

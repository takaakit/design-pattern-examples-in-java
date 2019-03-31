package creationalpatterns.prototype.framework;
// ˅
import java.util.*;
import java.text.*;

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
        return d.createClone();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

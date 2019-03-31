package creationalpatterns.abstractfactory.factory;
// ˅
import java.util.*;
import java.text.*;

// ˄

public abstract class Item {
    // ˅
    
    // ˄

    protected final String name;

    public Item(String name) {
        // ˅
        this.name = name;
        
        // ˄
    }

    public abstract String toHTML();

    // ˅
    
    // ˄
}

// ˅

// ˄

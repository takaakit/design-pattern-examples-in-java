package creationalpatterns.abstractfactory.factory;
// ˅
import java.util.*;
import java.text.*;

// ˄

public abstract class Link extends Item {
    // ˅
    
    // ˄

    protected final String url;

    public Link(String name, String url) {
        // ˅
        super(name);
        this.url = url;
        
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

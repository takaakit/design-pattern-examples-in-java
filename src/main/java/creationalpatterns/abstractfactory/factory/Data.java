package creationalpatterns.abstractfactory.factory;
// ˅
import java.util.*;
import java.text.*;

// ˄

public abstract class Data extends Item {
    // ˅
    
    // ˄

    protected List<Item> items;

    public Data(String name) {
        // ˅
        super(name);
        this.items = new ArrayList<>();
        
        // ˄
    }

    public void add(Item item) {
        // ˅
        items.add(item);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package creationalpatterns.abstractfactory.factory;
// ˅

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

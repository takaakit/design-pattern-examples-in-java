package creationalpatterns.abstractfactory.factory;
// ˅

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

package creationalpatterns.factorymethod.framework;
// ˅

// ˄

public abstract class Factory {
    // ˅
    
    // ˄

    public Product create(String owner) {
        // ˅
        return createProduct(owner);
        // ˄
    }

    protected abstract Product createProduct(String owner);

    // ˅
    
    // ˄
}

// ˅

// ˄

package creationalpatterns.factorymethod.framework;
// ˅

// ˄

public abstract class Factory {
    // ˅
    
    // ˄

    public Product create(String owner) {
        // ˅
        // Write pre-creation code here.

        // Encapsulate the knowledge of which Product subclass to create and move this knowledge out of the framework.
        Product product = createProduct(owner);

        // Write post-creation code here.

        return product;
        // ˄
    }

    protected abstract Product createProduct(String owner);

    // ˅
    
    // ˄
}

// ˅

// ˄

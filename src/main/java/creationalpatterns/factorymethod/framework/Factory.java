package creationalpatterns.factorymethod.framework;
// ˅

// ˄

public abstract class Factory {
    // ˅
    
    // ˄

    public Product create(String owner) {
        // ˅
        // Write pre-creation code here, if any.

        Product product = createProduct(owner);

        // Write post-creation code here, if any.

        return product;
        // ˄
    }

    protected abstract Product createProduct(String owner);

    // ˅
    
    // ˄
}

// ˅

// ˄

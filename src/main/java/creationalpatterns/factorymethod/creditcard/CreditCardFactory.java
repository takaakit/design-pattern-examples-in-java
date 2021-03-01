package creationalpatterns.factorymethod.creditcard;
// ˅
import creationalpatterns.factorymethod.framework.Factory;
import creationalpatterns.factorymethod.framework.Product;

// ˄

public class CreditCardFactory extends Factory {
    // ˅
    
    // ˄

    public CreditCardFactory() {
        // ˅
        
        // ˄
    }

    @Override
    protected Product createProduct(String owner) {
        // ˅
        return new CreditCard(owner);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

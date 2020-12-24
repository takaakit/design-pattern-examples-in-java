package creationalpatterns.factorymethod.idcard;
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
    public Product createProduct(String owner) {
        // ˅
        return new CreditCard(owner);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

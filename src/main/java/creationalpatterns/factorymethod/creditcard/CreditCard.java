package creationalpatterns.factorymethod.creditcard;
// ˅
import creationalpatterns.factorymethod.framework.Product;

// ˄

public class CreditCard implements Product {
    // ˅
    
    // ˄

    private final String owner;

    public CreditCard(String owner) {
        // ˅
        this.owner = owner;
        System.out.println("Make " + owner + "'s card.");
        // ˄
    }

    @Override
    public void use() {
        // ˅
        System.out.println("Use " + owner + "'s card.");
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

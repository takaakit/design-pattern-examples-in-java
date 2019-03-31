package creationalpatterns.factorymethod.idcard;
// ˅
import java.util.*;
import java.text.*;
import creationalpatterns.factorymethod.framework.Factory;
import creationalpatterns.factorymethod.framework.Product;

// ˄

public class CreditCardFactory extends Factory {
    // ˅
    
    // ˄

    private final List<String> cardOwners;

    public CreditCardFactory() {
        // ˅
        this.cardOwners = new ArrayList<>();
        
        // ˄
    }

    @Override
    public Product createProduct(String owner) {
        // ˅
        return new CreditCard(owner);
        // ˄
    }

    @Override
    public void registerProduct(Product product) {
        // ˅
        cardOwners.add(((CreditCard)product).owner);
        // ˄
    }

    public List<String> getCardOwner() {
        // ˅
        return cardOwners;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

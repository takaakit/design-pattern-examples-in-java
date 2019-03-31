package creationalpatterns.factorymethod.idcard;
// ˅
import java.util.*;
import java.text.*;
import creationalpatterns.factorymethod.framework.Product;

// ˄

public class CreditCard implements Product {
    // ˅
    
    // ˄

    final String owner;

    CreditCard(String owner) {
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

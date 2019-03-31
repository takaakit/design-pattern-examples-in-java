package behavioralpatterns.memento;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Memento {
    // ˅
    
    // ˄

    // Money
    int money;

    // Desserts
    List<String> desserts;

    Memento(int money) {
        // ˅
        this.money = money;
        this.desserts = new ArrayList<>();
        
        // ˄
    }

    // Add a dessert
    void addDessert(String dessert) {
        // ˅
        desserts.add(dessert);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

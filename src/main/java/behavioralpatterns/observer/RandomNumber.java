package behavioralpatterns.observer;
// ˅
import java.util.Random;

// ˄

// Generate a random number.
public class RandomNumber extends Number {
    // ˅
    
    // ˄

    private final Random random;

    public RandomNumber() {
        // ˅
        this.random = new Random();
        
        // ˄
    }

    @Override
    public void generate() {
        // ˅
        for (int i = 0; i < 20; i++) {
            value = random.nextInt(50);
            notifyObservers();
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

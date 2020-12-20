package behavioralpatterns.observer;
// ˅
import java.util.Random;

// ˄

// Generate a random number.
public class RandomNumber extends Number {
    // ˅
    
    // ˄

    private int value;

    private final Random random;

    public RandomNumber() {
        // ˅
        this.value = 0;
        this.random = new Random();
        
        // ˄
    }

    @Override
    public int getValue() {
        // ˅
        return value;
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

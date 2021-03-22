package behavioralpatterns.observer;
// ˅
import java.util.Random;

// ˄

public class NumberSubject extends Subject {
    // ˅
    
    // ˄

    private int value;

    public NumberSubject() {
        // ˅

        // ˄
    }

    public void setValue(int value) {
        // ˅
        this.value = value;
        notifyObservers();
        // ˄
    }

    public int getValue() {
        // ˅
        return value;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

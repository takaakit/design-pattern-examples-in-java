package behavioralpatterns.observer;
// ˅

// ˄

// Holds a value and notifies observers when the value is set.
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
        // Notify observers when the value is set.
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

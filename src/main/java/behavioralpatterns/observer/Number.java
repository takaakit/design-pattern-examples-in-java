package behavioralpatterns.observer;
// ˅
import java.util.ArrayList;
import java.util.List;

// ˄

// An abstract class that generates numbers.
public abstract class Number {
    // ˅
    
    // ˄

    protected int value;

    private final List<Observer> observers;

    public Number() {
        // ˅
        this.value = 0;
        this.observers = new ArrayList<>();
        
        // ˄
    }

    public abstract void generate();

    public void addObserver(Observer observer) {
        // ˅
        observers.add(observer);
        // ˄
    }

    public void removeObserver(Observer observer) {
        // ˅
        observers.remove(observer);
        // ˄
    }

    public void notifyObservers() {
        // ˅
        observers.forEach(observer -> observer.update(this));
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

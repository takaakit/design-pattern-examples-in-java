package behavioralpatterns.observer;
// ˅
import java.util.ArrayList;
import java.util.List;

// ˄

// An abstract class that generates numbers.
public abstract class Number {
    // ˅
    
    // ˄

    private final List<Observer> observers;

    public Number() {
        // ˅
        this.observers = new ArrayList<>();
        
        // ˄
    }

    public abstract void generate();

    public abstract int getValue();

    void addObserver(Observer observer) {
        // ˅
        observers.add(observer);
        // ˄
    }

    public void deleteObserver(Observer observer) {
        // ˅
        observers.remove(observer);
        // ˄
    }

    void notifyObservers() {
        // ˅
        observers.forEach(observer -> observer.update(this));
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

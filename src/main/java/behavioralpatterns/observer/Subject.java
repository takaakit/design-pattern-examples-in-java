package behavioralpatterns.observer;
// ˅
import java.util.ArrayList;
import java.util.List;

// ˄

// Provides an interface for attaching and detaching Observer objects.
public class Subject {
    // ˅
    
    // ˄

    private final List<Observer> observers;

    public Subject() {
        // ˅
        this.observers = new ArrayList<>();
        
        // ˄
    }

    public void attach(Observer observer) {
        // ˅
        observers.add(observer);
        // ˄
    }

    public void detach(Observer observer) {
        // ˅
        observers.remove(observer);
        // ˄
    }

    public void notifyObservers() {
        // ˅
        observers.forEach(observer -> observer.update(this));
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

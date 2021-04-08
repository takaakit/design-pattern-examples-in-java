package behavioralpatterns.observer;
// ˅

// ˄

// Display values as a number.
public class DigitObserver implements Observer {
    // ˅
    
    // ˄

    private final NumberSubject numberSubject;

    public DigitObserver(NumberSubject numberSubject) {
        // ˅
        this.numberSubject = numberSubject;
        // ˄
    }

    @Override
    public void update(Subject changedSubject) {
        // ˅
        if (changedSubject.equals(this.numberSubject)) {
            System.out.println("Digit    : " + this.numberSubject.getValue());
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

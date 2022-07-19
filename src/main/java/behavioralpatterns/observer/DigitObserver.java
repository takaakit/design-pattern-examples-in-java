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
        // Before processing, it checks to make sure the changed subject is the subject held.
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

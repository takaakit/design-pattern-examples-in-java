package behavioralpatterns.observer;
// ˅

// ˄

// Display values with digits.
public class DigitObserver implements Observer {
    // ˅
    
    // ˄

    @Override
    public void update(Number number) {
        // ˅
        System.out.println("Digit    : " + number.getValue());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.observer;
// ˅

// ˄

// Display values as a bar chart.
public class BarChartObserver implements Observer {
    // ˅
    
    // ˄

    private final NumberSubject numberSubject;

    public BarChartObserver(NumberSubject numberSubject) {
        // ˅
        this.numberSubject = numberSubject;
        // ˄
    }

    @Override
    public void update(Subject changedSubject) {
        // ˅
        // Before processing, it checks to make sure the changed subject is the subject held.
        if (changedSubject.equals(this.numberSubject)) {
            System.out.println("Bar chart: " + "*".repeat(this.numberSubject.getValue()));
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

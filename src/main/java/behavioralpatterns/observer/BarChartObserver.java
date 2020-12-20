package behavioralpatterns.observer;
// ˅

// ˄

// Display values with a bar chart.
public class BarChartObserver implements Observer {
    // ˅
    
    // ˄

    @Override
    public void update(Number number) {
        // ˅
        System.out.print("Bar chart: ");
        for (int i = 0; i < number.getValue(); i++) {
            System.out.print("*");
        }
        System.out.println();
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

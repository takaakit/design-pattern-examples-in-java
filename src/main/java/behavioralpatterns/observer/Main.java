package behavioralpatterns.observer;

// Observers observe objects generating a numerical value and display the value.

public class Main {
    public static void main(String[] args) {
        RandomNumber number = new RandomNumber();
        Observer digitObserver = new DigitObserver();
        Observer barChartObserver = new BarChartObserver();
        number.addObserver(digitObserver);
        number.addObserver(barChartObserver);
        number.generate();
    }
}

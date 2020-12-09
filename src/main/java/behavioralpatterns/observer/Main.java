package behavioralpatterns.observer;

/*
Observers observe objects generating a numerical value and display the value. The display formats are digits and bar charts.
 */

public class Main {
    public static void main(String[] args) {
        RandomNumber number = new RandomNumber();
        Observer digitObserver = new DigitObserver();
        number.addObserver(digitObserver);
        Observer barChartObserver = new BarChartObserver();
        number.addObserver(barChartObserver);
        number.generate();
    }
}

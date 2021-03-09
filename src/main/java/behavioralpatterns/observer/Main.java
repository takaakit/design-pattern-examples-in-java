package behavioralpatterns.observer;

/*
Observers observe objects generating a numerical value and display the value.
The display formats are digits and bar charts.
 */

public class Main {
    public static void main(String[] args) {
        RandomNumber number = new RandomNumber();
        number.addObserver(new DigitObserver());
        number.addObserver(new BarChartObserver());
        number.generate();
    }
}

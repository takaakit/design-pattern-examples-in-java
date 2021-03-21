package behavioralpatterns.observer;

/*
Observers observe a Subject object holding a numerical value and display the value.
The display formats are digits and bar charts.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumberSubject numberSubject = new NumberSubject();
        numberSubject.attach(new DigitObserver(numberSubject));
        numberSubject.attach(new BarChartObserver(numberSubject));

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numberSubject.setValue(random.nextInt(50));

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

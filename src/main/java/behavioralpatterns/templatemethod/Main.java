package behavioralpatterns.templatemethod;

/*
Display a character or string repeatedly 5 times.
 */

public class Main {
    public static void main(String[] args) {
        CharDisplay display1 = new CharDisplay('H');
        display1.output();

        StringDisplay display2 = new StringDisplay("Hello world.");
        display2.output();
    }
}

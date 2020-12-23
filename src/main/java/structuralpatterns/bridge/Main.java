package structuralpatterns.bridge;

/*
Display only one line or display the specified number of lines.
 */

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new TextDisplayImpl("Japan"));
        d1.output();

        MultiLineDisplay d2 = new MultiLineDisplay(new TextDisplayImpl("The United States of America"));
        d2.output();
        d2.outputMultiple(3);
    }
}

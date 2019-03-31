package structuralpatterns.bridge;

// Display only one line or display the specified number of lines.

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new TextDisplayImpl("Japan"));
        MultiLineDisplay d2 = new MultiLineDisplay(new TextDisplayImpl("The United States of America"));
        MultiLineDisplay d3 = new MultiLineDisplay(new TextDisplayImpl("Brazil"));
        d1.output();
        d2.output();
        d3.output();
        d3.displayMultiple(3);
    }
}

package behavioralpatterns.templatemethod;

// Display the character and string repeatedly 5 times.

public class Main {
    public static void main(String[] args) {
        CharDisplay display1 = new CharDisplay('H');                         // Create an instance of the CharDisplay
        StringDisplay display2 = new StringDisplay("Hello world.");          // Create an instance of the StringDisplay
        StringDisplay display3 = new StringDisplay("Nice to meet you.");     // Create an instance of the StringDisplay

        // Any instance can be called with the same method name
        display1.output();
        display2.output();
        display3.output();
    }
}

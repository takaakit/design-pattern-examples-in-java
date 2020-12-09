package structuralpatterns.decorator;

// Display a character string with a decorative frame.

public class Main {
    public static void main(String[] args) {
        Display displayA = new MessageDisplay("Nice to meet you.");
        displayA.show();

        Display displayB = new SideFrame(new MessageDisplay("Nice to meet you."), '!');
        displayB.show();

        Display displayC = new FullFrame(new SideFrame(new MessageDisplay("Nice to meet you."), '!'));
        displayC.show();
    }
}

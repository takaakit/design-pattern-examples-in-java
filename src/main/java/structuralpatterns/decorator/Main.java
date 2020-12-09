package structuralpatterns.decorator;

/*
Display a string with decorative frames. The frames can be combined arbitrarily.
 */

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

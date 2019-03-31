package structuralpatterns.decorator;

// Display a character string with a decorative frame.

public class Main {
    public static void main(String[] args) {
        Display displayA = new MessageDisplay("Nice to meet you.");
        displayA.show();

        Display displayB = new SideFrame(displayA, '!');
        displayB.show();

        Display displayC = new FullFrame(displayB);
        displayC.show();

        Display displayD = new SideFrame(
            new FullFrame(
                new FullFrame(
                    new SideFrame(
                        new SideFrame(
                            new FullFrame(
                                new MessageDisplay("See you again.")
                            ),
                            '#'
                        ),
                        '#'
                    )
                )
            ),
            '#'
        );
        displayD.show();
    }
}

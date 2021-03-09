package creationalpatterns.prototype;

import creationalpatterns.prototype.framework.Display;
import creationalpatterns.prototype.framework.Manager;

/*
Display a string enclosed with a frame line, or drawn with an underline. The Client (Main)
registers instances of the Display subclass in the Manager class. When necessary,
the Manager class asks those registered instances to return a clone. The Client (Main)
requires the returned clones to display.
 */

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        // Register instances of the "Display" subclass
        Display emphasisUnderline = new UnderlineDisplay('~');
        manager.registerDisplay("emphasis", emphasisUnderline);
        Display highlightFrame = new FrameDisplay('+');
        manager.registerDisplay("highlight", highlightFrame);
        Display warningFrame = new FrameDisplay('#');
        manager.registerDisplay("warning", warningFrame);

        // Require to display
        Display display1 = manager.getDisplay("emphasis");
        display1.show("Nice to meet you.");
        Display display2 = manager.getDisplay("highlight");
        display2.show("Nice to meet you.");
        Display display3 = manager.getDisplay("warning");
        display3.show("Nice to meet you.");
    }
}

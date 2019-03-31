package creationalpatterns.prototype;

import creationalpatterns.prototype.framework.Display;
import creationalpatterns.prototype.framework.Manager;

// Display a character string enclosed with a frame line, or drawn with an underline.

public class Main {
    public static void main(String[] args) {
        // Create a manager
        Manager manager = new Manager();
        Display emphasisUnderline = new UnderlineDisplay('~');
        Display highlightFrame = new FrameDisplay('+');
        Display warningFrame = new FrameDisplay('#');
        manager.registerDisplay("emphasis", emphasisUnderline);
        manager.registerDisplay("highlight", highlightFrame);
        manager.registerDisplay("warning", warningFrame);

        // Create displays
        Display display1 = manager.getDisplay("emphasis");
        display1.show("Nice to meet you.");
        Display display2 = manager.getDisplay("highlight");
        display2.show("Nice to meet you.");
        Display display3 = manager.getDisplay("warning");
        display3.show("Nice to meet you.");
    }
}

package creationalpatterns.prototype;

import creationalpatterns.prototype.framework.Display;
import creationalpatterns.prototype.framework.Manager;

// Display a character string enclosed with a frame line, or drawn with an underline.

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

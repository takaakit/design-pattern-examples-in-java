package behavioralpatterns.command;

import javafx.application.Application;

/*
Simple drawing application:
* Draw a path with points by dragging the mouse.
* Revert to one previous drawing by pressing the Undo button.
* Erase all drawing by pressing the Clear button.
 */

public class Main {
    public static void main(String[] args) {
        Application.launch(AppMain.class, args);
    }
}

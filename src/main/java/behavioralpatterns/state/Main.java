package behavioralpatterns.state;

import behavioralpatterns.state.AppSafe;
import javafx.application.Application;

// Safe security system that the security status changes with time.

public class Main {
    public static void main(String[] args) {
        Application.launch(AppSafe.class, args);
    }
}

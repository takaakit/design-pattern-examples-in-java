package behavioralpatterns.mediator;
// ˅
import javafx.scene.control.TextField;
import java.util.*;
import java.text.*;

// ˄

public class ColleagueTextField extends TextField implements Colleague {
    // ˅
    
    // ˄

    Mediator mediator;

    ColleagueTextField(String text) {
        // ˅
        super(text);
        this.mediator = null;
        setOnKeyReleased(e -> mediator.colleagueChanged());
        
        // ˄
    }

    @Override
    public void setMediator(Mediator mediator) {
        // ˅
        this.mediator = mediator;
        // ˄
    }

    // Set enable/disable from the Mediator
    @Override
    public void setActivation(boolean isEnable) {
        // ˅
        setDisable(!isEnable);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

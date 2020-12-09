package behavioralpatterns.mediator;
// ˅
import java.util.*;
import java.text.*;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.event.EventHandler;

// ˄

public class ColleagueRadioButton extends RadioButton implements Colleague {
    // ˅
    
    // ˄

    private Mediator mediator;

    ColleagueRadioButton(String caption) {
        // ˅
        super(caption);
        this.mediator = null;
        setOnAction(e -> mediator.colleagueChanged());
        
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

package behavioralpatterns.mediator;
// ˅
import java.util.*;
import java.text.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

// ˄

public class ColleagueButton extends Button implements Colleague {
    // ˅
    
    // ˄

    private Mediator mediator;

    ColleagueButton(String caption) {
        // ˅
        super(caption);
        this.mediator = null;
        setOnMousePressed(e -> mediator.colleagueChanged());
        
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

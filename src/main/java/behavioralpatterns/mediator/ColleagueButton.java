package behavioralpatterns.mediator;
// ˅
import javafx.scene.control.Button;

// ˄

public class ColleagueButton extends Colleague {
    // ˅
    
    // ˄

    private final Button button;

    public ColleagueButton(Button button) {
        // ˅
        this.mediator = null;
        this.button = button;
        this.button.setOnMousePressed(e -> mediator.colleagueChanged());
        
        // ˄
    }

    // Set enable/disable from the Mediator
    @Override
    public void setActivation(boolean isEnable) {
        // ˅
        this.button.setDisable(!isEnable);
        // ˄
    }

    public boolean isPressed() {
        // ˅
        return button.isPressed();
        // ˄
    }

    public Button getButton() {
        // ˅
        return button;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

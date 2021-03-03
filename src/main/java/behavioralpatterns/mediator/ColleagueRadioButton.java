package behavioralpatterns.mediator;
// ˅
import javafx.scene.control.RadioButton;

// ˄

public class ColleagueRadioButton extends Colleague {
    // ˅
    
    // ˄

    private final RadioButton radioButton;

    public ColleagueRadioButton(RadioButton radioButton) {
        // ˅
        this.mediator = null;
        this.radioButton = radioButton;
        this.radioButton.setOnAction(e -> mediator.colleagueChanged());

        // ˄
    }

    // Set enable/disable from the Mediator
    @Override
    public void setActivation(boolean isEnable) {
        // ˅
        radioButton.setDisable(!isEnable);
        // ˄
    }

    public boolean isSelected() {
        // ˅
        return radioButton.isSelected();
        // ˄
    }

    public RadioButton getRadioButton() {
        // ˅
        return radioButton;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.mediator;
// ˅
import javafx.scene.control.TextField;

// ˄

public class ColleagueTextField extends Colleague {
    // ˅
    
    // ˄

    private final TextField textField;

    public ColleagueTextField(TextField textField) {
        // ˅
        this.mediator = null;
        this.textField = textField;
        this.textField.setOnKeyReleased(e -> mediator.colleagueChanged());
        
        // ˄
    }

    // Set enable/disable from the Mediator
    @Override
    public void setActivation(boolean isEnable) {
        // ˅
        this.textField.setDisable(!isEnable);
        // ˄
    }

    public boolean isEmpty() {
        // ˅
        return textField.getText().isEmpty();
        // ˄
    }

    public TextField getTextField() {
        // ˅
        return textField;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

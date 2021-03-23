package behavioralpatterns.mediator;
// ˅
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// ˄

public class AppLogin extends Application implements Mediator {
    // ˅
    
    // ˄

    private ColleagueRadioButton radioLogin;

    private ColleagueRadioButton radioGuest;

    private ColleagueTextField textUsername;

    private ColleagueTextField textPassword;

    private ColleagueButton buttonOk;

    private ColleagueButton buttonCancel;

    public AppLogin() {
        // ˅
        this.radioLogin = null;
        this.radioGuest = null;
        this.textUsername = null;
        this.textPassword = null;
        this.buttonOk = null;
        this.buttonCancel = null;
        
        // ˄
    }

    @Override
    public void start(Stage primaryStage) {
        // ˅
        // Create TextField, Button and RadioButton
        createColleagues();

        ToggleGroup toggleGroup = new ToggleGroup();
        radioGuest.getRadioButton().setToggleGroup(toggleGroup);
        radioLogin.getRadioButton().setToggleGroup(toggleGroup);

        // Set a initial state
        radioGuest.getRadioButton().setSelected(true);
        textUsername.setActivation(false);
        textPassword.setActivation(false);
        buttonOk.setActivation(true);
        buttonCancel.setActivation(true);

        // Create panes
        HBox checkBoxPane = new HBox(radioGuest.getRadioButton(), radioLogin.getRadioButton());
        checkBoxPane.setSpacing(5.0);

        GridPane textFieldPane = new GridPane();
        textFieldPane.setHgap(5.0);
        textFieldPane.setVgap(2.0);
        textFieldPane.add(new Label("Username:"), 0, 0);
        textFieldPane.add(textUsername.getTextField(), 1, 0);
        textFieldPane.add(new Label("Password:"), 0, 1);
        textFieldPane.add(textPassword.getTextField(), 1, 1);

        HBox bottomPane = new HBox(buttonOk.getButton(), buttonCancel.getButton());
        bottomPane.setSpacing(5.0);
        bottomPane.setAlignment(Pos.CENTER_RIGHT);

        VBox mainPane = new VBox(checkBoxPane, textFieldPane, bottomPane);
        mainPane.setSpacing(5.0);
        mainPane.setPadding(new Insets(5.0, 5.0, 5.0, 5.0));

        // Create a scene
        Scene scene = new Scene(mainPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mediator Example");
        primaryStage.setOnCloseRequest(e -> System.exit(0));

        // Set mediators
        radioGuest.setMediator(this);
        radioLogin.setMediator(this);
        textUsername.setMediator(this);
        textPassword.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // Show
        primaryStage.show();
        // ˄
    }

    @Override
    public void createColleagues() {
        // ˅
        radioGuest = new ColleagueRadioButton(new RadioButton("Guest"));
        radioLogin = new ColleagueRadioButton(new RadioButton("Login"));
        textUsername = new ColleagueTextField(new TextField());
        textPassword = new ColleagueTextField(new PasswordField());
        buttonOk = new ColleagueButton(new Button("OK"));
        buttonCancel = new ColleagueButton(new Button("Cancel"));
        // ˄
    }

    // Change enable/disable of the Colleagues when notified from the Mediators.
    @Override
    public void colleagueChanged() {
        // ˅
        if (buttonOk.isPressed()
                || buttonCancel.isPressed()) {
            System.exit(0);
        }
        else {
            if (radioGuest.isSelected()) {          // Guest mode
                textUsername.setActivation(false);
                textPassword.setActivation(false);
                buttonOk.setActivation(true);
            }
            else {                                  // Login mode
                textUsername.setActivation(true);
                textPassword.setActivation(true);

                // Judge whether the changed Colleague is enabled or disabled
                if (!textUsername.isEmpty()
                        && !textPassword.isEmpty()) {
                    buttonOk.setActivation(true);
                }
                else {
                    buttonOk.setActivation(false);
                }
            }
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

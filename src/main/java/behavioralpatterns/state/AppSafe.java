package behavioralpatterns.state;
// ˅
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// ˄

// Safe security system that the security status changes with time.
public class AppSafe extends Application implements Context {
    // ˅

    // ˄

    // Current state
    private State state;

    // Display of security center
    private TextArea textMessage;

    // Current time
    private TextField textTime;

    public AppSafe() {
        // ˅
        this.textTime = null;
        this.textMessage = null;
        this.state = DaytimeState.getInstance();

        new Thread(() -> {
            while (true) {
                for (int hour = 0; hour < 24; hour++) {
                    setTime(hour);        // Set the time
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        // ˄
    }

    @Override
    public void start(Stage primaryStage) {
        // ˅
        textTime = new TextField("");
        textTime.setEditable(false);
        textMessage = new TextArea("");
        textMessage.setEditable(false);

        Button buttonUse = new Button("Use");
        buttonUse.setOnMouseClicked(e -> pressedUseButton());

        Button buttonAlarm = new Button("Alarm");
        buttonAlarm.setOnMouseClicked(e -> pressedAlarmButton());

        Button buttonPhone = new Button("Phone");
        buttonPhone.setOnMouseClicked(e -> pressedPhoneButton());

        Pane topPane = new Pane(textTime);
        Pane centerScreen = new Pane(textMessage);
        HBox bottomPane = new HBox(buttonUse, buttonAlarm, buttonPhone);
        bottomPane.setAlignment(Pos.BOTTOM_CENTER);
        VBox mainPane = new VBox(topPane, centerScreen, bottomPane);

        Scene scene = new Scene(mainPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("State Example");
        primaryStage.setOnCloseRequest(e -> System.exit(0));

        // Show
        primaryStage.show();
        // ˄
    }

    // Set time
    public void setTime(int hour) {
        // ˅
        Platform.runLater(() ->     // Updating UI is run on the JavaFX Application thread using Platform.runLater.
        {
            String currentTime = "Current Time : ";
            if (hour < 10) {
                currentTime += "0" + hour + ":00";
            }
            else {
                currentTime += hour + ":00";
            }

            System.out.println(currentTime);
            if (textTime != null) {
                textTime.setText(currentTime);
            }
        });

    	state.setTime(this, hour);
        // ˄
    }

    // Change state
    public void changeState(State state) {
        // ˅
        System.out.println("The state changed from " + this.state + " to " + state + ".");
        this.state = state;
        // ˄
    }

    // Call a security guard room
    public void callSecurityGuardsRoom(String msg) {
        // ˅
        textMessage.appendText("call! " + msg + "\n");
        // ˄
    }

    // Record security log
    public void recordSecurityLog(String msg) {
        // ˅
        textMessage.appendText("record ... " + msg + "\n");
        // ˄
    }

    private void pressedUseButton() {
        // ˅
        state.use(this);
        // ˄
    }

    private void pressedAlarmButton() {
        // ˅
        state.alarm(this);
        // ˄
    }

    private void pressedPhoneButton() {
        // ˅
        state.phone(this);
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄

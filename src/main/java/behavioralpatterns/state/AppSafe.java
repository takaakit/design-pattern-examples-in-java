package behavioralpatterns.state;
// ˅
import javafx.application.Application;
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

    // Current time
    private TextField textTime;

    // Display of security center
    private TextArea textMessage;

    // Current state
    private State state;

    public AppSafe() {
        // ˅
        this.textTime = null;
        this.textMessage = null;
        this.state = new DaytimeState();

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
        textMessage = new TextArea("");

        Button buttonUse = new Button("Use a safe");
        buttonUse.setOnMouseClicked(e -> state.useSafe(this));    // Safe use button pressed

        Button buttonAlarm = new Button("Sound an emergency bell");
        buttonAlarm.setOnMouseClicked(e -> state.soundBell(this));    // Emergency bell button pressed

        Button buttonPhone = new Button("Make a call");
        buttonPhone.setOnMouseClicked(e -> state.call(this));        // Normal call button pressed

        Button buttonExit = new Button("Exit");
        buttonExit.setOnMouseClicked(e -> System.exit(0));        // Exit button pressed

        Pane topPane = new Pane(textTime);
        Pane centerScreen = new Pane(textMessage);
        HBox bottomPane = new HBox(buttonUse, buttonAlarm, buttonPhone, buttonExit);
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

    // ˅

    // ˄
}

// ˅

// ˄

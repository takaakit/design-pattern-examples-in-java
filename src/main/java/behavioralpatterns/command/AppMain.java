package behavioralpatterns.command;
// ˅
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// ˄

public class AppMain extends Application {
    // ˅
    
    // ˄

    // Painting history
    private final HistoryCommand history;

    private final PaintingCanvas canvas;

    public AppMain() {
        // ˅
        this.history = new HistoryCommand();
        this.canvas = new PaintingCanvas(400.0, 300.0);
        
        // ˄
    }

    @Override
    public void start(Stage primaryStage) {
        // ˅
        // Create buttons
        Button undoButton = new Button("Undo");
        undoButton.setOnMousePressed(e -> undo());

        Button clearButton = new Button("Clear");
        clearButton.setOnMousePressed(e -> clear());

        // Create panes
        HBox hBox = new HBox(undoButton, clearButton);
        StackPane mainPane = new StackPane(canvas, hBox);

        // Create a scene
        Scene scene = new Scene(mainPane);
        scene.setOnMouseDragged(e -> onDragged(e.getSceneX(), e.getSceneY()));

        primaryStage.setTitle("Command Example");
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(e -> System.exit(0));

        // Show
        primaryStage.show();
        // ˄
    }

    private void onDragged(double x, double y) {
        // ˅
        PaintingCommand paintingCommand = new PaintingCommand(canvas, x, y);
        history.add(paintingCommand);
        paintingCommand.execute();
        // ˄
    }

    private void undo() {
        // ˅
        canvas.clear();
        history.undo();
        history.execute();
        // ˄
    }

    private void clear() {
        // ˅
        canvas.clear();
        history.clear();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

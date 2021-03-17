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
        Button clearButton = new Button("Clear");
        clearButton.setOnMousePressed(e -> {
            canvas.clear();
            history.clear();
        });

        Button undoButton = new Button("Undo");
        undoButton.setOnMousePressed(e -> {
            canvas.clear();
            history.undo();
            history.execute();
        });

        // Create panes
        HBox hBox = new HBox(undoButton, clearButton);
        StackPane mainPane = new StackPane(canvas, hBox);

        // Create a scene
        Scene scene = new Scene(mainPane);
        scene.setOnMouseDragged(e -> {
            PaintingCommand paintingCommand = new PaintingCommand(canvas, e.getSceneX(), e.getSceneY());
            history.add(paintingCommand);
            paintingCommand.execute();
        });

        primaryStage.setTitle("Command Example");
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(e -> System.exit(0));

        // Show
        primaryStage.show();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.command;
// ˅
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

// ˄

public class PaintingCanvas extends Canvas implements PaintingTarget {
    // ˅
    
    // ˄

    private final Color paintingColor;

    // Radius of the painting point
    private final double pointRadius;

    public PaintingCanvas(double width, double height) {
        // ˅
        setWidth(width);
        setHeight(height);
        this.paintingColor = Color.LIGHTGREEN;
        this.pointRadius = 6.0;
        
        // ˄
    }

    @Override
    public void paint(double x, double y) {
        // ˅
        getGraphicsContext2D().setFill(paintingColor);
        getGraphicsContext2D().fillOval(x - pointRadius, y - pointRadius, pointRadius * 3, pointRadius * 3);
        // ˄
    }

    @Override
    public void clear() {
        // ˅
        getGraphicsContext2D().clearRect(0.0, 0.0, getWidth(), getHeight());
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

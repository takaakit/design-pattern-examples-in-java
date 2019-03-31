package behavioralpatterns.command;
// ˅
import java.util.*;
import java.text.*;

// ˄

// Command to paint a single point
public class PaintingCommand implements Command {
    // ˅
    
    // ˄

    // Painting position x
    private final double paintingPosX;

    // Painting position y
    private final double paintingPosY;

    private PaintingTarget paintingTarget;

    PaintingCommand(PaintingTarget paintingObject, double paintingPosX, double paintingPosY) {
        // ˅
        this.paintingPosX = paintingPosX;
        this.paintingPosY = paintingPosY;
        this.paintingTarget = paintingObject;
        
        // ˄
    }

    @Override
    public void execute() {
        // ˅
        paintingTarget.paint(paintingPosX, paintingPosY);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.command;
// ˅

// ˄

// Command to paint a single point
public class PaintingCommand implements Command {
    // ˅
    
    // ˄

    // Painting position x
    private final double paintingPosX;

    // Painting position y
    private final double paintingPosY;

    private final PaintingTarget paintingTarget;

    public PaintingCommand(PaintingTarget paintingTarget, double paintingPosX, double paintingPosY) {
        // ˅
        this.paintingPosX = paintingPosX;
        this.paintingPosY = paintingPosY;
        this.paintingTarget = paintingTarget;
        
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

package creationalpatterns.prototype;
// ˅
import creationalpatterns.prototype.framework.Display;

// ˄

public class FrameDisplay implements Display {
    // ˅
    
    // ˄

    private final char borderChar;

    public FrameDisplay(char borderChar) {
        // ˅
        this.borderChar = borderChar;
        
        // ˄
    }

    @Override
    public Display clone() {
        // ˅
        return new FrameDisplay(this.borderChar);
        // ˄
    }

    @Override
    public void show(String message) {
        // ˅
        int length = message.length();
        for (int i = 0; i < length + 4; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
        System.out.println(borderChar + " " + message + " " + borderChar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(borderChar);
        }
        System.out.println();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

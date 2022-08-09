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
        System.out.println(String.valueOf(borderChar).repeat(message.length() + 4));
        System.out.println(borderChar + " " + message + " " + borderChar);
        System.out.println(String.valueOf(borderChar).repeat(message.length() + 4));
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package creationalpatterns.prototype;
// ˅
import creationalpatterns.prototype.framework.Display;

// ˄

public class UnderlineDisplay implements Display {
    // ˅
    
    // ˄

    private final char underlineChar;

    public UnderlineDisplay(char underlineChar) {
        // ˅
        this.underlineChar = underlineChar;
        
        // ˄
    }

    @Override
    public Display clone() {
        // ˅
        return new UnderlineDisplay(this.underlineChar);
        // ˄
    }

    @Override
    public void show(String message) {
        // ˅
        System.out.println("\"" + message + "\"");
        System.out.println(" " + String.valueOf(underlineChar).repeat(message.length()));
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

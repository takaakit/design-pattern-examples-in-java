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
        int length = message.length();
        System.out.println("\"" + message + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }
        System.out.println();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

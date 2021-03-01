package structuralpatterns.flyweight;
// ˅
import java.util.ArrayList;
import java.util.List;

// ˄

public class LargeSizeString {
    // ˅
    
    // ˄

    private final List<LargeSizeChar> largeSizeChars;

    public LargeSizeString(String string) {
        // ˅
        this.largeSizeChars = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            largeSizeChars.add(LargeSizeCharFactory.getInstance().getLargeSizeChar(string.charAt(i)));
        }
        // ˄
    }

    public void display() {
        // ˅
        for (LargeSizeChar largeSizeChar : largeSizeChars) {
            largeSizeChar.display();
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

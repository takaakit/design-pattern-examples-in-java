package structuralpatterns.flyweight;
// ˅
import java.util.HashMap;
import java.util.Map;

// ˄

public class LargeSizeCharFactory {
    // ˅

    // ˄

    private static final Map<String, LargeSizeChar> poolChars = new HashMap<>();

    // Create an instance of the large size character.
    public static LargeSizeChar getLargeSizeChar(char charName) {
        // ˅
        LargeSizeChar lsc = poolChars.get(charName);
        if (lsc == null) {
            lsc = new LargeSizeChar(charName);            // Create an instance
            poolChars.put(String.valueOf(charName), lsc);
        }
        return lsc;
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄

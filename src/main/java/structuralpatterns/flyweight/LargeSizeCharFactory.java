package structuralpatterns.flyweight;
// ˅
import java.util.HashMap;
import java.util.Map;

// ˄

public class LargeSizeCharFactory {
    // ˅

    // ˄

    private final Map<String, LargeSizeChar> poolChars;

    private static final LargeSizeCharFactory instance = new LargeSizeCharFactory();

    public static LargeSizeCharFactory getInstance() {
        // ˅
        return instance;
        // ˄
    }

    private LargeSizeCharFactory() {
        // ˅
        poolChars = new HashMap<>();
        // ˄
    }

    // Create an instance of the large size character.
    public LargeSizeChar getLargeSizeChar(char charName) {
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

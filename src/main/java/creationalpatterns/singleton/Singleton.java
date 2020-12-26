package creationalpatterns.singleton;
// ˅

// ˄

public class Singleton {
    // ˅
    
    // ˄

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        // ˅
        return instance;
        // ˄
    }

    private Singleton() {
        // ˅
        
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

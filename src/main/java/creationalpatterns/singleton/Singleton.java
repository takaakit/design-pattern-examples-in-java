package creationalpatterns.singleton;
// ˅

// ˄

public class Singleton {
    // ˅
    
    // ˄

    private static final Singleton ourInstance = new Singleton();

    static Singleton getInstance() {
        // ˅
        return ourInstance;
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

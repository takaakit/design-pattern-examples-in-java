package creationalpatterns.singleton;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Singleton {
    // ˅
    
    // ˄

    private static Singleton ourInstance = new Singleton();

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

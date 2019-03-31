package behavioralpatterns.chainofresponsibility;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Trouble {
    // ˅
    
    // ˄

    // Trouble number
    final int id;

    Trouble(int id) {
        // ˅
        this.id = id;
        
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "[Trouble " + id + "]";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

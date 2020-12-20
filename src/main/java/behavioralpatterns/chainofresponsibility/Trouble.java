package behavioralpatterns.chainofresponsibility;
// ˅

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

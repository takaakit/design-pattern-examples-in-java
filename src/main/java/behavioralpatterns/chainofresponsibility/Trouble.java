package behavioralpatterns.chainofresponsibility;
// ˅

// ˄

public class Trouble {
    // ˅
    
    // ˄

    // Trouble number
    public final int id;

    public Trouble(int id) {
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

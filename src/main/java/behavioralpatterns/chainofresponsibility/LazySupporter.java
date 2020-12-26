package behavioralpatterns.chainofresponsibility;
// ˅

// ˄

public class LazySupporter extends Supporter {
    // ˅
    
    // ˄

    public LazySupporter(String name) {
        // ˅
        super(name);
        // ˄
    }

    // No troubles are handled.
    @Override
    public boolean canHandle(Trouble trouble) {
        // ˅
        return false;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

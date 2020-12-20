package behavioralpatterns.chainofresponsibility;
// ˅

// ˄

public class LazySupporter extends Supporter {
    // ˅
    
    // ˄

    LazySupporter(String name) {
        // ˅
        super(name);
        // ˄
    }

    // No troubles are handled.
    @Override
    protected boolean handle(Trouble trouble) {
        // ˅
        return false;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

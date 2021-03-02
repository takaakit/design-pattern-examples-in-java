package behavioralpatterns.chainofresponsibility;
// ˅

// ˄

public class MoodySupporter extends Supporter {
    // ˅
    
    // ˄

    public MoodySupporter(String name) {
        // ˅
        super(name);
        // ˄
    }

    // Troubles with an odd ID are handled.
    @Override
    protected boolean canHandle(Trouble trouble) {
        // ˅
        return trouble.id % 2 == 1;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

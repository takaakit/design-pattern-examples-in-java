package behavioralpatterns.chainofresponsibility;
// ˅

// ˄

public class LimitedSupporter extends Supporter {
    // ˅
    
    // ˄

    private final int limitId;

    public LimitedSupporter(String name, int limitId) {
        // ˅
        super(name);
        this.limitId = limitId;
        
        // ˄
    }

    // Troubles with an ID below the limit are handled.
    @Override
    protected boolean canHandle(Trouble trouble) {
        // ˅
        return trouble.id <= limitId;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

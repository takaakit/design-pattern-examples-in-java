package behavioralpatterns.chainofresponsibility;
// ˅

// ˄

public class SpecialSupporter extends Supporter {
    // ˅
    
    // ˄

    private final int targetId;

    public SpecialSupporter(String name, int targetId) {
        // ˅
        super(name);
        this.targetId = targetId;
        
        // ˄
    }

    // Troubles with the specific ID are handled.
    @Override
    protected boolean canHandle(Trouble trouble) {
        // ˅
        return trouble.id == targetId;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

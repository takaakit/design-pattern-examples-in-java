package behavioralpatterns.chainofresponsibility;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class SpecialSupporter extends Supporter {
    // ˅
    
    // ˄

    private final int targetId;

    SpecialSupporter(String name, int targetId) {
        // ˅
        super(name);
        this.targetId = targetId;
        
        // ˄
    }

    // Troubles with the specific ID are handled.
    @Override
    protected boolean handle(Trouble trouble) {
        // ˅
        return trouble.id == targetId;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.chainofresponsibility;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class LimitedSupporter extends Supporter {
    // ˅
    
    // ˄

    private final int limitId;

    LimitedSupporter(String name, int limitId) {
        // ˅
        super(name);
        this.limitId = limitId;
        
        // ˄
    }

    // Troubles with an ID below the limit are handled.
    @Override
    protected boolean handle(Trouble trouble) {
        // ˅
        return trouble.id <= limitId;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

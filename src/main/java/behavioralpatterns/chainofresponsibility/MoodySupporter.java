package behavioralpatterns.chainofresponsibility;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class MoodySupporter extends Supporter {
    // ˅
    
    // ˄

    MoodySupporter(String name) {
        // ˅
        super(name);
        // ˄
    }

    // Troubles with an odd ID are handled.
    @Override
    protected boolean handle(Trouble trouble) {
        // ˅
        return trouble.id % 2 == 1;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

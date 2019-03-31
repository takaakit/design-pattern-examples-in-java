package behavioralpatterns.chainofresponsibility;
// ˅
import java.util.*;
import java.text.*;

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

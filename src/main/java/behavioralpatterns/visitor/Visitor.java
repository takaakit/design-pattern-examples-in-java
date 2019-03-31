package behavioralpatterns.visitor;
// ˅
import java.util.*;
import java.text.*;

// ˄

public interface Visitor {

    void visit(File file);

    void visit(Directory directory);

    // ˅
    
    // ˄
}

// ˅

// ˄

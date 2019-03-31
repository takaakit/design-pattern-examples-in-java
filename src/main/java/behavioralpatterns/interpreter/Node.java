package behavioralpatterns.interpreter;
// ˅
import java.util.*;
import java.text.*;

// ˄

// Node in the syntax tree.
public interface Node {

    void parse(Context context) throws Exception;

    // ˅
    
    // ˄
}

// ˅

// ˄

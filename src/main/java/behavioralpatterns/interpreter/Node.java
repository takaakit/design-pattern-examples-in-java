package behavioralpatterns.interpreter;
// ˅

// ˄

// Node in the syntax tree.
public interface Node {

    void parse(Context context) throws Exception;

    String toString();

    // ˅
    
    // ˄
}

// ˅

// ˄

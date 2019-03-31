package behavioralpatterns.visitor;
// ˅
import java.util.*;
import java.text.*;

// ˄

public abstract class FileSystemElement implements Element {
    // ˅
    
    // ˄

    protected String name;

    protected int size;

    public abstract String getName();

    public abstract int getSize();

    @Override
    public String toString() {
        // ˅
        return name + " (" + size + ")";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

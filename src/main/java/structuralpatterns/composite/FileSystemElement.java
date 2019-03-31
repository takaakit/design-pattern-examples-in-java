package structuralpatterns.composite;
// ˅
import java.util.*;
import java.text.*;

// ˄

public abstract class FileSystemElement {
    // ˅
    
    // ˄

    protected String name;

    protected int size;

    // Print this element with the "upperPath".
    public abstract void print(String upperPath);

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

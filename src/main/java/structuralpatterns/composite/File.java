package structuralpatterns.composite;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class File extends FileSystemElement {
    // ˅
    
    // ˄

    public File(String name, int size) {
        // ˅
        this.name = name;
        this.size = size;
        // ˄
    }

    // Print this element with the "upperPath".
    @Override
    public void print(String upperPath) {
        // ˅
        System.out.println(upperPath + "/" + this);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

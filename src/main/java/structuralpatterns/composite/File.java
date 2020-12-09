package structuralpatterns.composite;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class File extends FileSystemElement {
    // ˅
    
    // ˄

    private String name;

    private int size;

    public File(String name, int size) {
        // ˅
        this.name = name;
        this.size = size;
        // ˄
    }

    @Override
    public String getName() {
        // ˅
        return name;
        // ˄
    }

    @Override
    public int getSize() {
        // ˅
        return size;
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

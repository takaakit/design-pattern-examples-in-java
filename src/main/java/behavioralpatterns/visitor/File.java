package behavioralpatterns.visitor;
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
    public void accept(Visitor visitor) {
        // ˅
        visitor.visit(this);
        // ˄
    }

    // File name
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

    // ˅
    
    // ˄
}

// ˅

// ˄

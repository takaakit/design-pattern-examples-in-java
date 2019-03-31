package structuralpatterns.composite;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Directory extends FileSystemElement {
    // ˅
    
    // ˄

    private final List<FileSystemElement> elements;

    public Directory(String name) {
        // ˅
        this.name = name;
        this.elements = new ArrayList<>();
        
        // ˄
    }

    // Print this element with the "upperPath".
    @Override
    public void print(String upperPath) {
        // ˅
        System.out.println(upperPath + "/" + this);
        elements.forEach(element -> element.print(upperPath + "/" + name));
        // ˄
    }

    // Add a element
    public FileSystemElement add(FileSystemElement element) {
        // ˅
        elements.add(element);
        return this;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

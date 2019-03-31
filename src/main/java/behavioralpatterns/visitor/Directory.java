package behavioralpatterns.visitor;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Directory extends FileSystemElement {
    // ˅
    
    // ˄

    // Collection of elements
    private final List<FileSystemElement> elements;

    public Directory(String name) {
        // ˅
        this.name = name;
        this.elements = new ArrayList<>();
        
        // ˄
    }

    // Accept a visitor
    @Override
    public void accept(Visitor visitor) {
        // ˅
        visitor.visit(this);
        // ˄
    }

    // Add an entry
    public FileSystemElement add(FileSystemElement element) {
        // ˅
        elements.add(element);
        return this;
        // ˄
    }

    // Create a iterator
    public Iterator<FileSystemElement> iterator() {
        // ˅
        return elements.iterator();
        // ˄
    }

    // Directory name
    @Override
    public String getName() {
        // ˅
        return null;
        // ˄
    }

    @Override
    public int getSize() {
        // ˅
        elements.forEach(element -> size += element.getSize());
        return size;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

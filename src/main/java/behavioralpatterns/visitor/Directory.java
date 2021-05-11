package behavioralpatterns.visitor;
// ˅
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ˄

public class Directory extends FileSystemElement {
    // ˅
    
    // ˄

    private final String name;

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

    // Directory name
    @Override
    public String getName() {
        // ˅
        return name;
        // ˄
    }

    // Directory size
    @Override
    public int getSize() {
        // ˅
        int size = 0;
        for (FileSystemElement element : elements) {
            size += element.getSize();
        }
        return size;
        // ˄
    }

    // Add an element
    public void add(FileSystemElement element) {
        // ˅
        elements.add(element);
        // ˄
    }

    // Get the iterator
    public Iterator<FileSystemElement> iterator() {
        // ˅
        return elements.iterator();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

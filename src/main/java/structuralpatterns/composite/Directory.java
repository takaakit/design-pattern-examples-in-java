package structuralpatterns.composite;
// ˅
import java.util.ArrayList;
import java.util.List;

// ˄

public class Directory extends FileSystemElement {
    // ˅
    
    // ˄

    private final String name;

    private final List<FileSystemElement> elements;

    public Directory(String name) {
        // ˅
        this.name = name;
        this.elements = new ArrayList<>();
        
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
        int size = 0;
        for (FileSystemElement element : elements) {
            size += element.getSize();
        }
        return size;
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

    // Add an element
    public void add(FileSystemElement element) {
        // ˅
        elements.add(element);
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

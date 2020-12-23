package behavioralpatterns.visitor;
// ˅

// ˄

public class File extends FileSystemElement {
    // ˅
    
    // ˄

    private final String name;

    private final int size;

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

    // File size
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

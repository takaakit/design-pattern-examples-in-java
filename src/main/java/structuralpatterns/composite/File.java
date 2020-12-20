package structuralpatterns.composite;
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

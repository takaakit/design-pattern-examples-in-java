package structuralpatterns.composite;
// ˅

// ˄

public abstract class FileSystemElement {
    // ˅
    
    // ˄

    public abstract String getName();

    public abstract int getSize();

    // Print this element with the "upperPath".
    public abstract void print(String upperPath);

    @Override
    public String toString() {
        // ˅
        return getName() + " (" + getSize() + ")";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

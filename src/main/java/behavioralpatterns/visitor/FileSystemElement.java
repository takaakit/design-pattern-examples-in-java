package behavioralpatterns.visitor;
// ˅

// ˄

public abstract class FileSystemElement implements Element {
    // ˅
    
    // ˄

    public abstract String getName();

    public abstract int getSize();

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

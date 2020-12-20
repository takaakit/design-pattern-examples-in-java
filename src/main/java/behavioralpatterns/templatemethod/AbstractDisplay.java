package behavioralpatterns.templatemethod;
// ˅

// ˄

public abstract class AbstractDisplay {
    // ˅
    
    // ˄

    public abstract void open();

    public abstract void write();

    public abstract void close();

    public void output() {
        // ˅
        open();
        for (int i = 0; i < 5; i++) {       // Repeat write 5 times
            write();
        }
        close();
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

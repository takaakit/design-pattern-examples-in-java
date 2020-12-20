package behavioralpatterns.chainofresponsibility;
// ˅

// ˄

public abstract class Supporter {
    // ˅
    
    // ˄

    // Supporter name
    private final String name;

    // Next supporter
    private Supporter next;

    Supporter(String name) {
        // ˅
        this.name = name;
        this.next = null;
        
        // ˄
    }

    // Trouble support
    // Troubles are sent around.
    void support(Trouble trouble) {
        // ˅
        if (handle(trouble)) {
            supported(trouble);
        }
        else if (next != null) {
            next.support(trouble);
        }
        else {
            unsupported(trouble);
        }
        // ˄
    }

    // Set a next supporter.
    public Supporter setNext(Supporter next) {
        // ˅
        this.next = next;
        return next;
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "[" + name + "]";
        // ˄
    }

    protected abstract boolean handle(Trouble trouble);

    // Trouble was supported.
    private void supported(Trouble trouble) {
        // ˅
        System.out.println(trouble.toString() + " was handled by " + this + ".");
        // ˄
    }

    // Trouble was unsupported.
    private void unsupported(Trouble trouble) {
        // ˅
        System.out.println(trouble.toString() + " was not handled.");
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

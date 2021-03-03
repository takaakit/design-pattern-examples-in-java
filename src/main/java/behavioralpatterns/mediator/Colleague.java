package behavioralpatterns.mediator;
// ˅

// ˄

public abstract class Colleague {
    // ˅
    
    // ˄

    protected Mediator mediator;

    protected Colleague() {
        // ˅
        this.mediator = null;

        // ˄
    }

    // Set enable/disable from the Mediator
    public abstract void setActivation(boolean isEnable);

    public void setMediator(Mediator mediator) {
        // ˅
        this.mediator = mediator;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

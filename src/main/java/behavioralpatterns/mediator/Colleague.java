package behavioralpatterns.mediator;
// ˅

// ˄

public interface Colleague {

    void setMediator(Mediator mediator);

    // Set enable/disable from the Mediator
    void setActivation(boolean isEnable);

    // ˅
    
    // ˄
}

// ˅

// ˄

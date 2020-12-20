package behavioralpatterns.state;
// ˅

// ˄

public interface Context {

    // Set time
    void setTime(int hour);

    // Change state
    void changeState(State state);

    // Call a security guard room
    void callSecurityGuardsRoom(String msg);

    // Record security log
    void recordSecurityLog(String msg);

    // ˅
    
    // ˄
}

// ˅

// ˄

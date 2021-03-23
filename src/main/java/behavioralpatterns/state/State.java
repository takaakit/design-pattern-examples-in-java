package behavioralpatterns.state;
// ˅

// ˄

public interface State {

    // Set time
    void setTime(Context context, int hour);

    // Use a safe
    void useSafe(Context context);

    // Sound a emergency bell
    void soundBell(Context context);

    // Make a normal call
    void call(Context context);

    String toString();

    // ˅
    
    // ˄
}

// ˅

// ˄

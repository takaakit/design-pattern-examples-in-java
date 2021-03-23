package behavioralpatterns.state;
// ˅

// ˄

public interface State {

    void setTime(Context context, int hour);

    void use(Context context);

    void alarm(Context context);

    void phone(Context context);

    String toString();

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.state;
// ˅

// ˄

public class NightState implements State {
    // ˅
    
    // ˄

    private static NightState instance = new NightState();

    public static NightState getInstance() {
        // ˅
        return instance;
        // ˄
    }

    private NightState() {
        // ˅
        
        // ˄
    }

    @Override
    public void setTime(Context context, int hour) {
        // ˅
        if (9 <= hour && hour < 17) {
            context.changeState(DaytimeState.getInstance());
        }
        // ˄
    }

    @Override
    public void use(Context context) {
        // ˅
        context.callSecurityGuardsRoom("Emergency: Use a safe at night!");
        // ˄
    }

    @Override
    public void alarm(Context context) {
        // ˅
        context.callSecurityGuardsRoom("Sound an emergency bell at night");
        // ˄
    }

    @Override
    public void phone(Context context) {
        // ˅
        context.recordSecurityLog("Record a night call");
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "[Night]";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

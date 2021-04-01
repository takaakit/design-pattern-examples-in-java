package behavioralpatterns.state;
// ˅

// ˄

public class DaytimeState implements State {
    // ˅
    
    // ˄

    private static DaytimeState instance = new DaytimeState();

    public static DaytimeState getInstance() {
        // ˅
        return instance;
        // ˄
    }

    private DaytimeState() {
        // ˅
        
        // ˄
    }

    @Override
    public void setTime(Context context, int hour) {
        // ˅
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
        // ˄
    }

    @Override
    public void use(Context context) {
        // ˅
        context.recordSecurityLog("Use a safe in the daytime");
        // ˄
    }

    @Override
    public void alarm(Context context) {
        // ˅
        context.callSecurityGuardsRoom("Sound an emergency bell in the daytime");
        // ˄
    }

    @Override
    public void phone(Context context) {
        // ˅
        context.callSecurityGuardsRoom("Make a normal call in the daytime");
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "[Daytime]";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

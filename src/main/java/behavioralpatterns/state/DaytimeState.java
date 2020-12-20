package behavioralpatterns.state;
// ˅

// ˄

public class DaytimeState implements State {
    // ˅
    
    // ˄

    // Set time
    @Override
    public void setTime(Context context, int hour) {
        // ˅
        if (hour < 9 || 17 <= hour) {
            context.changeState(new NightState());
        }
        // ˄
    }

    // Use a safe
    @Override
    public void useSafe(Context context) {
        // ˅
        context.recordSecurityLog("Use a safe in the daytime");
        // ˄
    }

    // Sound a emergency bell
    @Override
    public void soundBell(Context context) {
        // ˅
        context.callSecurityGuardsRoom("Sound a emergency bell in the daytime");
        // ˄
    }

    // Make a normal call
    @Override
    public void call(Context context) {
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

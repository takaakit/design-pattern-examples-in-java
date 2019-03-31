package behavioralpatterns.state;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class NightState implements State {
    // ˅
    
    // ˄

    // Set time
    @Override
    public void setTime(Context context, int hour) {
        // ˅
        if (9 <= hour && hour < 17) {
            context.changeState(new DaytimeState());
        }
        // ˄
    }

    // Use a safe
    @Override
    public void useSafe(Context context) {
        // ˅
        context.callSecurityGuardsRoom("Emergency: Use a safe at night!");
        // ˄
    }

    // Sound a emergency bell
    @Override
    public void soundBell(Context context) {
        // ˅
        context.callSecurityGuardsRoom("Sound a emergency bell at night");
        // ˄
    }

    // Make a normal call
    @Override
    public void call(Context context) {
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

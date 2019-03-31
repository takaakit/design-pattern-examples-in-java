package behavioralpatterns.strategy;
// ˅
import java.util.*;
import java.text.*;

// ˄

public interface Strategy {

    Hand nextHand();

    void learn(boolean win);

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.strategy;
// ˅

// ˄

public interface Strategy {

    // Show a hand signal.
    HandSignal showHandSignal();

    // Notify a game result.
    void notifyGameResult(GameResultType result, HandSignal ownHand, HandSignal opponentsHand);

    // ˅
    
    // ˄
}

// ˅

// ˄

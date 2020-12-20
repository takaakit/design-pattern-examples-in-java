package behavioralpatterns.strategy;
// ˅

// ˄

// Mirror Strategy: showing a hand signal from the previous opponent's hand signal.
public class MirrorStrategy implements Strategy {
    // ˅
    
    // ˄

    private HandSignal preOpponentsHand;

    public MirrorStrategy() {
        // ˅
        this.preOpponentsHand = HandSignal.getHand(HandSignal.ROCK);
        
        // ˄
    }

    @Override
    public HandSignal showHandSignal() {
        // ˅
        return preOpponentsHand;
        // ˄
    }

    @Override
    public void notifyGameResult(GameResultType result, HandSignal ownHand, HandSignal opponentsHand) {
        // ˅
        preOpponentsHand = opponentsHand;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

package behavioralpatterns.strategy;
// ˅
import java.util.Random;

// ˄

// Random Strategy: showing a random hand signal.
public class RandomStrategy implements Strategy {
    // ˅

    // ˄

    private final Random random;

    public RandomStrategy() {
        // ˅
        this.random = new Random();
        
        // ˄
    }

    @Override
    public HandSignal showHandSignal() {
        // ˅
        return HandSignal.getHand(random.nextInt(3));
        // ˄
    }

    @Override
    public void notifyGameResult(GameResultType result, HandSignal ownHand, HandSignal opponentsHand) {
        // ˅
        // Do nothing
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

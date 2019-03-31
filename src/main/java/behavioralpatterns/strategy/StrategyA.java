package behavioralpatterns.strategy;
// ˅
import java.util.*;
import java.text.*;
import java.util.Random;

// ˄

// When winning a game, show the same hand at the next time.
public class StrategyA implements Strategy {
    // ˅
    
    // ˄

    private final Random random;

    private boolean won;

    private Hand preHand;

    public StrategyA(int randomSeed) {
        // ˅
        this.random = new Random(randomSeed);
        this.won = false;
        this.preHand = Hand.getHand(Hand.ROCK);
        
        // ˄
    }

    @Override
    public Hand nextHand() {
        // ˅
        if (!won) {
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
        // ˄
    }

    @Override
    public void learn(boolean win) {
        // ˅
        won = win;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

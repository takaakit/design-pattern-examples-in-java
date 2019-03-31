package behavioralpatterns.strategy;
// ˅
import java.util.*;
import java.text.*;

// ˄

// Calculate a hand from the previous hand stochastically.
public class StrategyB implements Strategy {
    // ˅
    
    // ˄

    private final Random random;

    private final int[][] history;

    private Hand preHand;

    private Hand curHand;

    public StrategyB(int randomSeed) {
        // ˅
        this.random = new Random(randomSeed);
        this.history = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        this.preHand = new Hand(Hand.ROCK);
        this.curHand = new Hand(Hand.ROCK);
        
        // ˄
    }

    @Override
    public Hand nextHand() {
        // ˅
        int randomHandValue = random.nextInt(getHistorySum(curHand.value));
        int handValue = 0;
        if (randomHandValue < history[curHand.value][0]) {
            handValue = Hand.ROCK;
        }
        else if (randomHandValue < history[curHand.value][0] + history[curHand.value][1]) {
            handValue = Hand.SCISSORS;
        }
        else {
            handValue = Hand.PAPER;
        }
        preHand = curHand;
        curHand = Hand.getHand(handValue);
        return curHand;
        // ˄
    }

    @Override
    public void learn(boolean win) {
        // ˅
        if (win) {
            history[preHand.value][curHand.value]++;
        }
        else {
            history[preHand.value][(curHand.value + 1) % 3]++;
            history[preHand.value][(curHand.value + 2) % 3]++;
        }
        // ˄
    }

    private int getHistorySum(int handValue) {
        // ˅
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handValue][i];
        }
        return sum;
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

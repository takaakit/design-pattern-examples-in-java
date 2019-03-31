package behavioralpatterns.strategy;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Player {
    // ˅
    
    // ˄

    private final String name;

    private int winCount;

    private int lossCount;

    private int gameCount;

    private final Strategy strategy;

    public Player(String name, Strategy strategy) {
        // ˅
        this.name = name;
        this.winCount = 0;
        this.lossCount = 0;
        this.gameCount = 0;
        this.strategy = strategy;
        
        // ˄
    }

    // Calculate a hand from the strategy.
    Hand nextHand() {
        // ˅
        return strategy.nextHand();
        // ˄
    }

    // Won a game.
    void won() {
        // ˅
        strategy.learn(true);
        winCount++;
        gameCount++;
        // ˄
    }

    // Lost a game.
    void lost() {
        // ˅
        strategy.learn(false);
        lossCount++;
        gameCount++;
        // ˄
    }

    // Drew a game.
    void drew() {
        // ˅
        gameCount++;
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return name + " [" + gameCount + " games, " + winCount + " won, " + lossCount + " lost, " + (gameCount - winCount - lossCount) + " drew]";
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

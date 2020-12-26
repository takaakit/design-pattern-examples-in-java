package behavioralpatterns.strategy;
// ˅
import java.util.*;

// ˄

public class HandSignal {
    // ˅
    
    // ˄

    // Rock
    public static final int ROCK = 0;

    // Scissors
    public static final int SCISSORS = 1;

    // Paper
    public static final int PAPER = 2;

    // Hands of rock-scissors-paper
    private static final List<HandSignal> handSignals = Arrays.asList(new HandSignal(ROCK), new HandSignal(SCISSORS), new HandSignal(PAPER));

    // Characters of the hands
    private static final List<String> name = Arrays.asList("Rock", "Scissors", "Paper");

    // Values of rock, scissors and paper.
    private final int value;

    // Get an instance of the hand
    public static HandSignal getHand(int handValue) {
        // ˅
        return handSignals.get(handValue);
        // ˄
    }

    public HandSignal(int value) {
        // ˅
        this.value = value;
        
        // ˄
    }

    // Return true if "this" is stronger than "hand".
    public boolean isStrongerThan(HandSignal hand) {
        // ˅
        return judgeGame(hand) == 1;
        // ˄
    }

    // Return false if "this" is weaker than "hand".
    public boolean isWeakerThan(HandSignal hand) {
        // ˅
        return judgeGame(hand) == -1;
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return name.get(value);
        // ˄
    }

    // The draw is 0. "this" win is 1. "hand" win is -1.
    private int judgeGame(HandSignal hand) {
        // ˅
        if (this == hand) {
            return 0;
        }
        else if ((this.value + 1) % 3 == hand.value) {
            return 1;
        }
        else {
            return -1;
        }
        // ˄
    }

    // ˅
    
    // ˄
}

// ˅

// ˄

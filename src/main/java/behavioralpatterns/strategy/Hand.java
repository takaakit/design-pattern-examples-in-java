package behavioralpatterns.strategy;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Hand {
    // ˅
    
    // ˄

    // Rock
    static final int ROCK = 0;

    // Scissors
    static final int SCISSORS = 1;

    // Paper
    static final int PAPER = 2;

    // Hands of rock-scissors-paper
    private static List<Hand> hands = Arrays.asList(new Hand(ROCK), new Hand(SCISSORS), new Hand(PAPER));

    // Characters of the hands
    private static List<String> name = Arrays.asList("Rock", "Scissors", "Paper");

    // Values of rock, scissors and paper.
    final int value;

    // Get an instance of the hand
    static Hand getHand(int handValue) {
        // ˅
        return hands.get(handValue);
        // ˄
    }

    public Hand(int value) {
        // ˅
        this.value = value;
        
        // ˄
    }

    // Return true if "this" is stronger than "hand".
    boolean isStrongerThan(Hand hand) {
        // ˅
        return judgeGame(hand) == 1;
        // ˄
    }

    // Return false if "this" is weaker than "hand".
    public boolean isWeakerThan(Hand hand) {
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
    private int judgeGame(Hand hand) {
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

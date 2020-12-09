package behavioralpatterns.memento;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Gamer {
    // ˅

    // ˄

    // Gamer's money
    int money;

    // Random number generator
    private final Random random;

    Gamer(int money) {
        // ˅
        this.money = money;
        this.random = new Random();

        // ˄
    }

    // Get current status
    Memento createMemento() {
        // ˅
        return new Memento(money);
        // ˄
    }

    // Undo status
    void restoreMemento(Memento memento) {
        // ˅
        this.money = memento.money;
        // ˄
    }

    // Play a game
    void play() {
        // ˅
        int dice = random.nextInt(6) + 1;    // Shake a dice
        System.out.println("The number of dice is " + dice + ".");

        int preMoney = money;
        switch (dice) {
        case 1:
        case 3:
        case 5:
            // In case of odd...Money is halved
            money /= 2;
            System.out.println("Gamer's money is halved: " + preMoney + " -> " + money);
            break;
        case 2:
        case 4:
        case 6:
            // In case of even...Money doubles
            money *= 2;
            System.out.println("Gamer's money doubles: " + preMoney + " -> " + money);
            break;
        default:
            // Other...Exit
            System.err.println("Unexpected value.");
            System.exit(-1);
        }
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "[money = " + money + "]";
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄

package behavioralpatterns.memento;
// ˅
import java.util.Random;

// ˄

public class Gamer {
    // ˅

    // ˄

    // Gamer's money
    private int money;

    // Random number generator
    private final Random random;

    public Gamer(int money) {
        // ˅
        this.money = money;
        this.random = new Random();

        // ˄
    }

    public Memento createMemento() {
        // ˅
        return new Memento(money);
        // ˄
    }

    public void setMemento(Memento memento) {
        // ˅
        this.money = memento.getMoney();
        // ˄
    }

    // Play a game
    public void play() {
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

    public int getMoney() {
        // ˅
        return money;
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

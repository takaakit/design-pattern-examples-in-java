package behavioralpatterns.memento;
// ˅
import java.util.*;
import java.text.*;

// ˄

public class Gamer {
    // ˅

    // ˄

    // Dessert name table
    private static String[] dessertsName = {"Cake", "Candy", "Cookie"};

    // Gamer's money
    int money;

    // Acquired desserts
    private List<String> desserts;

    // Random number generator
    private final Random random;

    Gamer(int money) {
        // ˅
        this.money = money;
        this.desserts = new ArrayList<>();
        this.random = new Random();

        // ˄
    }

    // Get a dessert
    private String getDessert() {
        // ˅
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "Delicious ";
        }
        return prefix + dessertsName[random.nextInt(dessertsName.length)];
        // ˄
    }

    // Get current status
    Memento createMemento() {
        // ˅
        Memento memento = new Memento(money);
        for (String dessert : desserts) {
            if (dessert.startsWith("Delicious ")) {         // Add a only delicious dessert
                memento.addDessert(dessert);
            }
        }
        return memento;
        // ˄
    }

    // Undo status
    void restoreMemento(Memento memento) {
        // ˅
        this.money = memento.money;
        this.desserts = memento.desserts;
        // ˄
    }

    // Play a game
    void play() {
        // ˅
        int dice = random.nextInt(6) + 1;    // Shake a dice
        switch (dice) {
        case 1:
            // In case of 1...Gamer's money increases
            money += 100;
            System.out.println("Gamer's money increases.");
            break;
        case 2:
            // In case of 2...Gamer's money halves
            money /= 2;
            System.out.println("Gamer's money halves.");
            break;
        case 6:
            // In case of 6...Gamer gets desserts
            String dessert = getDessert();
            System.out.println("Gamer gets desserts(" + dessert + ")");
            desserts.add(dessert);
            break;
        default:
            // Other...Nothing happens
            System.out.println("Nothing happens.");
        }
        // ˄
    }

    @Override
    public String toString() {
        // ˅
        return "[money = " + money + ", desserts = " + desserts + "]";
        // ˄
    }

    // ˅

    // ˄
}

// ˅

// ˄

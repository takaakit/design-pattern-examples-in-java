package behavioralpatterns.memento;

/*
Dice game collecting fruits.

* A gamer shakes a dice and the number determine the next state.
* Gamer's money increases or decreases depending on the number. The gamer sometimes gets desserts.
* The game is over if the gamer's money runs out.
*/

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);                  // The initial money is 100
        Memento memento = gamer.createMemento();     // Save the initial state

        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);                  // Display count
            System.out.println("Current state: " + gamer);    // Display the current state of the gamer

            gamer.play();                        // Play a game

            System.out.println("Gamer's money is " + gamer.money + ".");

            // Determine the behavior of the Memento
            if (gamer.money > memento.money) {
                System.out.println("(Save the current state because money has increased.)");
                memento = gamer.createMemento();
            }
            else if (gamer.money < memento.money / 2) {
                System.out.println("(Go back to the previous state because money has decreased.)");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }
    }
}

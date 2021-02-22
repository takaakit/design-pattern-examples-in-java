package behavioralpatterns.memento;

/*
A dice game in which money increases and decreases:
* A gamer shakes a dice and the number determine the next state.
* If the number of dice is even, gamer's money doubles, and if it is odd, gamer's money is halved.
* If the gamer's money is less than half of the highest amount, it returns to the highest amount.
* The game is repeated.
 */

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);           // The initial money is 100
        Memento memento = gamer.createMemento();    // Save the initial state

        for (int i = 0; i < 10; i++) {
            System.out.println("==== Turn " + (i + 1));   // Display count

            gamer.play();                           // Play a game

            // Determine the behavior of the Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("(Gamers' money is the highest ever, so record the current state.)");
                memento = gamer.createMemento();
            }
            else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("(Gamer's money is less than half of the highest amount, so return to the recorded state.)");
                gamer.setMemento(memento);
                System.out.println("Gamer's money returns to " + gamer.getMoney() + ".");
            }

            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package behavioralpatterns.strategy;

/*
A game of rock-scissors-paper. Two strategies are available:
* Random Strategy: showing a random hand signal.
* Mirror Strategy: showing a hand signal from the previous opponent's hand signal.
 */

import static behavioralpatterns.strategy.GameResultType.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Emily", new RandomStrategy());
        Player player2 = new Player("James", new MirrorStrategy());

        for (int i = 0; i < 100; i++) {
            HandSignal handOfPlayer1 = player1.showHandSignal();
            HandSignal handOfPlayer2 = player2.showHandSignal();
            GameResultType resultOfPlayer1;
            GameResultType resultOfPlayer2;
            if (handOfPlayer1.isStrongerThan(handOfPlayer2)) {
                System.out.println("Winner: " + player1);
                resultOfPlayer1 = Win;
                resultOfPlayer2 = Loss;
            }
            else if (handOfPlayer2.isStrongerThan(handOfPlayer1)) {
                System.out.println("Winner: " + player2);
                resultOfPlayer1 = Loss;
                resultOfPlayer2 = Win;
            }
            else {
                System.out.println("Draw...");
                resultOfPlayer1 = Draw;
                resultOfPlayer2 = Draw;
            }
            player1.notifyGameResult(resultOfPlayer1, handOfPlayer1, handOfPlayer2);
            player2.notifyGameResult(resultOfPlayer2, handOfPlayer2, handOfPlayer1);
        }
        System.out.println("RESULT:");
        System.out.println(player1);
        System.out.println(player2);
    }
}

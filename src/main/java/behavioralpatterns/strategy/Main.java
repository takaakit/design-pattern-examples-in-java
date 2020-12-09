package behavioralpatterns.strategy;

/*
A game of rock-scissors-paper. Two strategies are available:
* When winning a game, show the same hand at the next time.
* Calculate a hand from the previous hand stochastically.
 */

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main RandomSeedNumber1 RandomSeedNumber2");
            System.out.println("Ex.  : java Main 314 15");
        }
        else {
            int randomSeed1 = Integer.parseInt(args[0]);
            int randomSeed2 = Integer.parseInt(args[1]);
            Player player1 = new Player("Emily", new StrategyA(randomSeed1));
            Player player2 = new Player("James", new StrategyB(randomSeed2));

            for (int i = 0; i < 100; i++) {
                Hand nextHand1 = player1.nextHand();
                Hand nextHand2 = player2.nextHand();
                if (nextHand1.isStrongerThan(nextHand2)) {
                    System.out.println("Winner: " + player1);
                    player1.won();
                    player2.lost();
                }
                else if (nextHand2.isStrongerThan(nextHand1)) {
                    System.out.println("Winner: " + player2);
                    player1.lost();
                    player2.won();
                }
                else {
                    System.out.println("Draw...");
                    player1.drew();
                    player2.drew();
                }
            }
            System.out.println("RESULT:");
            System.out.println(player1);
            System.out.println(player2);
        }
    }
}

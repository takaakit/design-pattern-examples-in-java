package behavioralpatterns.strategy;
// ˅

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

    // Show a hand signal from the strategy.
    public HandSignal showHandSignal() {
        // ˅
        return strategy.showHandSignal();
        // ˄
    }

    // Notify a game result.
    public void notifyGameResult(GameResultType result, HandSignal ownHand, HandSignal opponentsHand) {
        // ˅
        switch (result) {
            case Win:
                winCount++;
                gameCount++;
                break;
            case Loss:
                lossCount++;
                gameCount++;
                break;
            case Draw:
                gameCount++;
                break;
        }

        strategy.notifyGameResult(result, ownHand, opponentsHand);
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

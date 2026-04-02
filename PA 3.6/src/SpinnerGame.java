/**
 * Jessica willis
 * 3/28/2026
 * 3.6
 */

public class SpinnerGame extends BoardGame {
    public SpinnerGame(String name, int numPlayers, int maxMove) {
        super(name, numPlayers, maxMove);
    }

    @Override
    public String startGame() {
        return "Spinning to decide starting player.";
    }

    @Override
    public String startTurn() {
        return "Player spins the wheel to determine movement.";
    }

}

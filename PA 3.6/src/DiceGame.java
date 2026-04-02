/*
Jessica Willis
3/28/2026
3.6
*/

public class DiceGame extends BoardGame{
    public DiceGame(String name, int numPlayers, int maxMove) {
        super(name, numPlayers, maxMove);
    }

    @Override
    public String startGame() {
        return "Rolling dice to determine who goes first.";
    }

    @Override
    public String startTurn() {
        return "Player rolls dice to begin their move.";
    }

}

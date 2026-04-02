/*
Jessica Willis
3/28/2026
3.6
*/

public abstract class BoardGame extends Game {
    private int maxMove;

    public BoardGame(String name, int numPlayers, int maxMove) {
        super(name, numPlayers);
        this.maxMove = maxMove;
    }

    public int getMaxMove() {
        return maxMove;
    }

    @Override
    public String endTurn() {
        return "Turn ends after moving up to " + maxMove + " spaces.";
    }

    public abstract String startGame();
    public abstract String startTurn();

    @Override
    public String toString() {
        return super.toString() + "\nMax Move: " + maxMove;
    }

    

}

/**
 * Jessica Willis
 * 3/28/2026
 * PA 3.6
 */


public abstract class Game {
    private String name;
    private int numPlayers;

    public Game(String name, int numPlayers) {
        this.name = name;
        this.numPlayers = numPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public abstract String startGame();
    public abstract String startTurn();
    public abstract String endTurn();

    @Override
    public String toString() {
        return "Game Name: " + name + "\nNumber of Players: " + numPlayers;
    }

}

/**
 * Jessica Willis
 * 3/28/2026
 * 3.6
 */

public class CardGame extends Game {
    private int numCards;

    public CardGame(String name, int numPlayers, int numCards) {
        super(name, numPlayers);
        this.numCards = numCards;
    }

    @Override
    public String startGame() {
        return "Shuffling the deck and dealing " + numCards + " cards.";
    }

    @Override
    public String startTurn() {
        return "Player draws a card and begins their turn.";
    }

    @Override
    public String endTurn() {
        return "Player discards a card to end their turn.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nCards per player: " + numCards;
    }

}

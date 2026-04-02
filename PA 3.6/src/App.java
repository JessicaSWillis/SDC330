/**
 * Jessica Willis
 * 3/28/2026
 * 3.6
 */


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis IC 3.6");
        CardGame cardGame = new CardGame("Poker", 4, 5);
        DiceGame diceGame = new DiceGame("Ludo", 4, 6);
        SpinnerGame spinnerGame = new SpinnerGame("Life", 4, 10);

        System.out.println("=== Card Game Information ===");
        System.out.println(cardGame);
        System.out.println(cardGame.startGame());
        System.out.println(cardGame.startTurn());
        System.out.println(cardGame.endTurn());
        System.out.println();

        System.out.println("=== Dice Game Information ===");
        System.out.println(diceGame);
        System.out.println(diceGame.startGame());
        System.out.println(diceGame.startTurn());
        System.out.println(diceGame.endTurn());
        System.out.println();

        System.out.println("=== Spinner Game Information ===");
        System.out.println(spinnerGame);
        System.out.println(spinnerGame.startGame());
        System.out.println(spinnerGame.startTurn());
        System.out.println(spinnerGame.endTurn());
        System.out.println();
    }
}

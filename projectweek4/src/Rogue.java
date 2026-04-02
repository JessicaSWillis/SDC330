/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Rogue class
 */

public class Rogue extends Character {
    private int stealthLevel;

    public Rogue(int id, String name, String race, int level, AbilityScores abilityScores, int stealthLevel) {
        super(id, name, race, level, abilityScores);
        this.stealthLevel = stealthLevel;
    }

    @Override
    public String getCharacterClass() {
        return "Rogue";
    }

    @Override
    public void displayCharacter() {
        super.displayCharacter();
        System.out.println("Stealth Level: " + stealthLevel);
    }
}
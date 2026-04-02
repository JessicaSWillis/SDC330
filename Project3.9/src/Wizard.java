/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Wizard class
 */

public class Wizard extends Character {
    private String spellSchool;

    public Wizard(int id, String name, String race, int level, AbilityScores abilityScores, String spellSchool) {
        super(id, name, race, level, abilityScores);
        this.spellSchool = spellSchool;
    }

    @Override
    public String getCharacterClass() {
        return "Wizard";
    }

    @Override
    public void displayCharacter() {
        super.displayCharacter();
        System.out.println("Spell School: " + spellSchool);
    }
}
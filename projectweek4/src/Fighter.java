/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Fighter
 */

public class Fighter extends Character {
    private String weaponType;

    public Fighter(int id, String name, String race, int level, AbilityScores abilityScores, String weaponType) {
        super(id, name, race, level, abilityScores);
        this.weaponType = weaponType;
    }

    @Override
    public String getCharacterClass() {
        return "Fighter";
    }

    @Override
    public void displayCharacter() {
        super.displayCharacter();
        System.out.println("Weapon Type: " + weaponType);
    }
}

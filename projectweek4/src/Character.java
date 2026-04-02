/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Abstract base class for all characters
 */

public abstract class Character {
    protected int id;
    protected String name;
    protected String race;
    protected int level;
    protected AbilityScores abilityScores;

    public Character(int id, String name, String race, int level, AbilityScores abilityScores) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.level = level;
        this.abilityScores = abilityScores;
    }

    public abstract String getCharacterClass();

    public void displayCharacter() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Class: " + getCharacterClass());
        System.out.println("Level: " + level);
        System.out.println("Ability Scores: " + abilityScores);
        System.out.println("----------------------------");
    }
}
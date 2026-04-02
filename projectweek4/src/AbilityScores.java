/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Stores ability scores for a character
 */

public class AbilityScores {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public AbilityScores(int str, int dex, int con, int intel, int wis, int cha) {
        this.strength = str;
        this.dexterity = dex;
        this.constitution = con;
        this.intelligence = intel;
        this.wisdom = wis;
        this.charisma = cha;
    }

    public int getStrength() { return strength; }
    public int getDexterity() { return dexterity; }
    public int getConstitution() { return constitution; }
    public int getIntelligence() { return intelligence; }
    public int getWisdom() { return wisdom; }
    public int getCharisma() { return charisma; }

    public String toString() {
        return "STR: " + strength + ", DEX: " + dexterity + ", CON: " + constitution +
               ", INT: " + intelligence + ", WIS: " + wisdom + ", CHA: " + charisma;
    }
}
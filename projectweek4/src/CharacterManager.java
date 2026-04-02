/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Character Manager
 */

import java.util.List;
import java.util.Scanner;

public class CharacterManager {
    private DatabaseManager dbManager;
    private Scanner scanner;

    public CharacterManager() {
        dbManager = new DatabaseManager();
        scanner = new Scanner(System.in);
    }

    public void createCharacter() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Race: ");
        String race = scanner.nextLine();

        System.out.print("Enter Level: ");
        int level = scanner.nextInt();

        System.out.println("Enter Ability Scores:");
        AbilityScores stats = new AbilityScores(
                scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt(), scanner.nextInt()
        );

        scanner.nextLine();

        System.out.print("Choose Class (1=Fighter, 2=Wizard, 3=Rogue): ");
        int choice = scanner.nextInt();

        Character character;

        switch (choice) {
            case 1:
                character = new Fighter(id, name, race, level, stats, "Sword");
                break;
            case 2:
                character = new Wizard(id, name, race, level, stats, "Evocation");
                break;
            default:
                character = new Rogue(id, name, race, level, stats, 5);
        }

        dbManager.createCharacter(character);
    }

    public void viewCharacters() {
        List<Character> characters = dbManager.getAllCharacters();
        for (Character c : characters) {
            c.displayCharacter();
        }
    }

    public void deleteCharacter() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        dbManager.deleteCharacter(id);
    }
}
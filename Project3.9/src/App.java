/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: main!
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=== D&D Character Manager ===");
            System.out.println("1. Create Character");
            System.out.println("2. View Characters");
            System.out.println("3. Delete Character");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.createCharacter();
                    break;
                case 2:
                    manager.viewCharacters();
                    break;
                case 3:
                    manager.deleteCharacter();
                    break;
            }

        } while (choice != 4);
        scanner.close();
        System.out.println("Goodbye!");
    }
}
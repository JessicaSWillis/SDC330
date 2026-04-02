/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Database Manager
 */

import java.util.ArrayList;
import java.util.List;


public class DatabaseManager implements CharacterActions {

    private List<Character> characterList;

    public DatabaseManager() {
        characterList = new ArrayList<>();
    }

    @Override
    public void createCharacter(Character character) {
        characterList.add(character);
        System.out.println("Character added.");
    }

    @Override
    public List<Character> getAllCharacters() {
        return characterList;
    }

    @Override
    public void updateCharacter(Character updatedCharacter) {
        for (int i = 0; i < characterList.size(); i++) {
            if (characterList.get(i).id == updatedCharacter.id) {
                characterList.set(i, updatedCharacter);
                System.out.println("Character updated.");
                return;
            }
        }
        System.out.println("Character not found.");
    }

    @Override
    public void deleteCharacter(int id) {
        characterList.removeIf(c -> c.id == id);
        System.out.println("Character deleted.");
    }
}
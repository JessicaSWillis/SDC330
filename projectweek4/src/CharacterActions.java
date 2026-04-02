/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: interface for character actions
 */

import java.util.List;

public interface CharacterActions {
    void createCharacter(Character character);
    List<Character> getAllCharacters();
    void updateCharacter(Character character);
    void deleteCharacter(int id);
}
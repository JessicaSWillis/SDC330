/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Course Project
 * Description: Database Manager
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager implements CharacterActions {

    private Connection connection;

    public DatabaseManager() {
        connect();
        createTables();
    }

    // Connect to SQLite
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:characters.db");
            System.out.println("Connected to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create tables if they don't exist
    private void createTables() {
        String charactersTable = "CREATE TABLE IF NOT EXISTS Characters (id INTEGER PRIMARY KEY, name TEXT NOT NULL, race TEXT NOT NULL, class TEXT NOT NULL, level INTEGER NOT NULL);";

        String abilityTable = "CREATE TABLE IF NOT EXISTS AbilityScores (id INTEGER PRIMARY KEY AUTOINCREMENT, character_id INTEGER NOT NULL, strength INTEGER, dexterity INTEGER, constitution INTEGER, intelligence INTEGER,  wisdom INTEGER, charisma INTEGER, FOREIGN KEY(character_id) REFERENCES Characters(id));";

        try (Statement stmt = connection.createStatement()) {
            stmt.execute(charactersTable);
            stmt.execute(abilityTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    @Override
    public void createCharacter(Character character) {
        String insertCharacter = "INSERT INTO Characters VALUES (?, ?, ?, ?, ?)";
        String insertStats = "INSERT INTO AbilityScores (character_id, strength, dexterity, constitution, intelligence, wisdom, charisma) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt1 = connection.prepareStatement(insertCharacter);
             PreparedStatement stmt2 = connection.prepareStatement(insertStats)) {

            stmt1.setInt(1, character.id);
            stmt1.setString(2, character.name);
            stmt1.setString(3, character.race);
            stmt1.setString(4, character.getCharacterClass());
            stmt1.setInt(5, character.level);
            stmt1.executeUpdate();

            AbilityScores a = character.abilityScores;

            stmt2.setInt(1, character.id);
            stmt2.setInt(2, a.getStrength());
            stmt2.setInt(3, a.getDexterity());
            stmt2.setInt(4, a.getConstitution());
            stmt2.setInt(5, a.getIntelligence());
            stmt2.setInt(6, a.getWisdom());
            stmt2.setInt(7, a.getCharisma());
            stmt2.executeUpdate();

            System.out.println("Character saved to database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    @Override
    public List<Character> getAllCharacters() {
        List<Character> list = new ArrayList<>();

        String query = "SELECT c.*, a.* FROM Characters c JOIN AbilityScores a ON c.id = a.character_id";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                AbilityScores stats = new AbilityScores(
                        rs.getInt("strength"),
                        rs.getInt("dexterity"),
                        rs.getInt("constitution"),
                        rs.getInt("intelligence"),
                        rs.getInt("wisdom"),
                        rs.getInt("charisma")
                );

                String type = rs.getString("class");

                Character character;

                switch (type) {
                    case "Fighter":
                        character = new Fighter(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("race"),
                                rs.getInt("level"),
                                stats,
                                "Sword"
                        );
                        break;
                    case "Wizard":
                        character = new Wizard(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("race"),
                                rs.getInt("level"),
                                stats,
                                "Evocation"
                        );
                        break;
                    default:
                        character = new Rogue(
                                rs.getInt("id"),
                                rs.getString("name"),
                                rs.getString("race"),
                                rs.getInt("level"),
                                stats,
                                5
                        );
                }

                list.add(character);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // UPDATE
    @Override
    public void updateCharacter(Character character) {
        String update = "UPDATE Characters SET name=?, race=?, class=?, level=? WHERE id=?";

        try (PreparedStatement stmt = connection.prepareStatement(update)) {
            stmt.setString(1, character.name);
            stmt.setString(2, character.race);
            stmt.setString(3, character.getCharacterClass());
            stmt.setInt(4, character.level);
            stmt.setInt(5, character.id);
            stmt.executeUpdate();

            System.out.println("Character updated.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    @Override
    public void deleteCharacter(int id) {
        try {
            connection.prepareStatement("DELETE FROM AbilityScores WHERE character_id=" + id).executeUpdate();
            connection.prepareStatement("DELETE FROM Characters WHERE id=" + id).executeUpdate();

            System.out.println("Character deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
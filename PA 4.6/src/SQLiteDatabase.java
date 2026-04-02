/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Performance Assessment - Database
 * Description: This class handles connecting to the SQLite database.
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteDatabase {

    public static Connection connect(String dbName) {
        Connection conn = null;

        try {
            String url = "jdbc:sqlite:" + dbName;
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
        }

        return conn;
    }
}
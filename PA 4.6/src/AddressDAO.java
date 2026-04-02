/**
 * Name: Jessica WIllis
 * Date: 04/02/2026
 * Assignment: SDC330 Performance Assessment - Database
 * Description: This class performs CRUD operations on the Addresses table.
 */

import java.sql.*;
import java.util.ArrayList;

public class AddressDAO {

    private Connection conn;

    public AddressDAO(Connection conn) {
        this.conn = conn;
    }

    // Create table
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS Addresses (id INTEGER PRIMARY KEY AUTOINCREMENT, street1 TEXT, street2 TEXT, city TEXT, state TEXT, zip TEXT);";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Create (Insert)
    public void addAddress(Address address) {
        String sql = "INSERT INTO Addresses(street1, street2, city, state, zip) VALUES(?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, address.getStreet1());
            pstmt.setString(2, address.getStreet2());
            pstmt.setString(3, address.getCity());
            pstmt.setString(4, address.getState());
            pstmt.setString(5, address.getZip());
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Read one
    public Address getAddress(int id) {
        String sql = "SELECT * FROM Addresses WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Address(
                        rs.getInt("id"),
                        rs.getString("street1"),
                        rs.getString("street2"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("zip")
                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    // Read all
    public ArrayList<Address> getAllAddresses() {
        ArrayList<Address> list = new ArrayList<>();
        String sql = "SELECT * FROM Addresses";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Address(
                        rs.getInt("id"),
                        rs.getString("street1"),
                        rs.getString("street2"),
                        rs.getString("city"),
                        rs.getString("state"),
                        rs.getString("zip")
                ));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

    // Update
    public void updateAddress(Address address) {
        String sql = "UPDATE Addresses SET street1=?, street2=?, city=?, state=?, zip=? WHERE id=?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, address.getStreet1());
            pstmt.setString(2, address.getStreet2());
            pstmt.setString(3, address.getCity());
            pstmt.setString(4, address.getState());
            pstmt.setString(5, address.getZip());
            pstmt.setInt(6, address.getId());
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete
    public void deleteAddress(int id) {
        String sql = "DELETE FROM Addresses WHERE id=?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
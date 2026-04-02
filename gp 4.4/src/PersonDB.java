/**
 * Jessica willis
 * 3/27/2026
 * gp 4.4
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDB {
    public static boolean createTable(Connection conn) {
        String sql = "Create Table if not exists People (\n" +
            " ID Ineger Primary key\n" +
            " ,firstName varchar(20)\n" +
            " ,lastName varchar(40)\n" +
            " ,Age integer);";

        System.out.println(sql);
        try {
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public static void addPerson(Connection conn, Person p) {
        String sql = 
            "Insert into People(FirstName, LastName, age) Values (?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, p.firstName);
            pst.setString(2, p.lastName);
            pst.setInt(3, p.age);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void updatePerson(Connection conn, Person p) {
        String sql = 
            "update People set firstName = ?, lastName = ?, age = ?, Where id = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, p.firstName);
            pst.setString(2, p.lastName);
            pst.setInt(3, p.age);
            pst.setInt(4, p.iD);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deletePerson(Connection conn, int id) {
        String sql = "DELETE FROM PEOPLE WHERE ID=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Person> getAllPeople(Connection conn) {
        ArrayList<Person> people = new ArrayList<Person>();
        String sql = "Select * from people";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                Person p = new Person(rs.getInt("iD"), rs.getString("firstName"),
                    rs.getString("lastName"), rs.getInt("age"));
                people.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return people;
    }

    public static Person getPerson(Connection conn, int id) {
        Person p = new Person();
        String sql = "Select * from people where id=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                p.iD = rs.getInt("iD");
                p.firstName = rs.getString("firstName");
                p.lastName = rs.getString("lastName");
                p.age = rs.getInt("age");
            } else {
                p.iD = id;
                p.firstName = "Not";
                p.lastName = "Found";
                p.age = 999;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return p;
    }

}

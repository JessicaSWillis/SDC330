/**
 * Name: Jessica WIllis
 * Date: 04/02/2026
 * Assignment: SDC330 Performance Assessment - Database
 * Description: Main application demonstrating CRUD operations on an Addresses database.
 */

import java.sql.Connection;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        System.out.println("Jessica Willis - Week 4 Database PA\n");

        Connection conn = SQLiteDatabase.connect("yourname.db");
        AddressDAO dao = new AddressDAO(conn);

        dao.createTable();

        // Add records
        dao.addAddress(new Address("123 Main St", "", "Norfolk", "VA", "23501"));
        dao.addAddress(new Address("456 Oak Ave", "Apt 2B", "Virginia Beach", "VA", "23451"));
        dao.addAddress(new Address("789 Pine Rd", "", "Chesapeake", "VA", "23320"));
        dao.addAddress(new Address("321 Maple Dr", "Suite 100", "Suffolk", "VA", "23434"));

        // Print all
        System.out.println("All Addresses in Database:\n");
        ArrayList<Address> addresses = dao.getAllAddresses();
        for (Address addr : addresses) {
            addr.printAddress();
        }

        // Invalid ID
        System.out.println("Attempting to retrieve invalid ID:\n");
        Address invalid = dao.getAddress(999);
        if (invalid == null) {
            System.out.println("No address found with that ID.\n");
        }

        // Update
        System.out.println("Updating Address ID 1:\n");
        Address update = dao.getAddress(1);
        if (update != null) {
            update = new Address(1, "999 Updated St", "", "Richmond", "VA", "23220");
            dao.updateAddress(update);

            Address updated = dao.getAddress(1);
            updated.printAddress();
        }

        // Delete
        System.out.println("Deleting Address ID 2:\n");
        dao.deleteAddress(2);

        System.out.println("All Addresses After Deletion:\n");
        addresses = dao.getAllAddresses();
        for (Address addr : addresses) {
            addr.printAddress();
        }
    }
}

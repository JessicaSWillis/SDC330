package edu.willis.rolodex.storage;

import edu.willis.rolodex.model.*;
import java.io.*;
import java.util.*;

/**
 * Demonstrates FILE STORAGE + POLYMORPHISM
 */

public class FileStorage implements Storage {

    private final String FILE = "src/main/resources/data.txt";

    @Override
    public void save(Contact contact) {
        try (FileWriter fw = new FileWriter(FILE, true)) {

            fw.write(contact.getFirstName() + "|" +
                     contact.getLastName() + "|" +
                     contact.getPhone() + "|" +
                     contact.getType() + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contact> findAll() {

        List<Contact> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] p = line.split("\\|");

                if (p[3].equals("Business")) {
                    list.add(new BusinessContact(p[0], p[1], p[2], null));
                } else {
                    list.add(new FriendContact(p[0], p[1], p[2], null));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
/*
Jessica Willis
3/7/2026
Project phase 1
Rolodex App
*/
import java.util.ArrayList;

public class Rolodex {
    private ArrayList<Contact> contacts;

    public Rolodex() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

}

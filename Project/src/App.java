/*
Jessica Willis
3/7/2026
Project phase 1
Rolodex App
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========================");
        System.out.println("Rolodex Contact Manager");
        System.out.println("Project Week 1");
        System.out.println("Jessica Willis");
        System.out.println("=========================");

        System.out.println();
        System.out.println("Welcome to the Rolodex!");
        System.out.println("THis program allows you to manage contacts.");

        //call rolodex
        Rolodex rolodex = new Rolodex();

        //create business contact
        BusinessContact b1 = new BusinessContact("John", "Smith", "555-1111", "JohnS@email.com", "Google", "Manager");
        
        //Create familiy contact
        FamilyContact f1 = new FamilyContact("Sarah", "Johnson", "555-2222", "SarahJ@email.com", "Sister");

        //add them to the rolodex
        rolodex.addContact(b1);
        rolodex.addContact(f1);

        //display contacts
        rolodex.displayContacts();
    }
}

/*
jessica willis
3/27/2026
gp 4.4
*/

import java.sql.Connection;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        final String dbName = "Jessica.db";
        System.out.println("jessica willis gp 4.4");
        Connection conn = SQLiteDatabase.connect(dbName);

        if (conn != null) {
            if (PersonDB.createTable(conn)) {
                PersonDB.addPerson(conn, new Person ("Jessica", "Willis", 27));
                PersonDB.addPerson(conn, new Person("John", "Smith", 45));
                PersonDB.addPerson(conn, new Person("Jane", "Jones", 24));
                PersonDB.addPerson(conn, new Person("Joe", "Diffy", 61));

                System.out.println("\nAll People in the Database");
                printPeople(PersonDB.getAllPeople(conn));
                System.out.println("\nGet a person using an invalid id");
                printPerson(PersonDB.getPerson(conn, -5));

                Person personToUpdate = new Person(2, "James", "Smith", 37);
                PersonDB.updatePerson(conn, personToUpdate);
                Person updatedPerson = PersonDB.getPerson(conn, personToUpdate.iD);
                System.out.println("\nUPdated person");
                printPerson(updatedPerson);
            }
        }
    }

    private static void printPeople(ArrayList<Person> people) {
        for (Person p : people) {
            printPerson(p);
        }
    }

    private static void printPerson(Person p) {
        System.out.print("Person " + p.iD + ": ");
        System.out.print(p.firstName + " " + p.lastName + " is" + p.age + " years old\n");
    }
}

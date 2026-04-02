/*
Jessica Willis
3/27/2026
gp 4.4
*/

public class Person {
    public int iD;
    public String firstName;
    public String lastName;
    public int age;

    public Person(int ID, String fName, String lName, int age) {
        iD = ID;
        firstName = fName;
        lastName = lName;
        this.age = age;
    }

    public Person(String fName, String lName, int age) {
        firstName = fName;
        lastName = lName;
        this.age = age;
    }

    public Person() {
        
    }

}

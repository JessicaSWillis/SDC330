/*
Jessica Willis
3/6/2026
1.5
In class assignment student person address
*/

public class Person {
    //variables
    private String fullName;
    private int idNumber;
    private Address homeAddress;

    // constructor
    public Person(String name, int id, Address address) {
        setFullName(name);
        setIdNumber(id);
        setHomeAddress(address);
    }

    // getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    // to string
    @Override
    public String toString() {
        return "Name: " + fullName + " | ID: " + idNumber + "\nAddress: " + homeAddress.toString();
    }

}

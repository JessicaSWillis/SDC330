package edu.willis.rolodex.model;


/**
 * Demonstrates ABSTRACTION
 */

public abstract class Contact {

    private String firstName;
    private String lastName;
    private String phone;

    // COMPOSITION
    private Address address;

    public Contact() {}

    public Contact(String firstName, String lastName, String phone, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public abstract String getType();

    // getters/setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
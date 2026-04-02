/**
 * Name: Jessica Willis
 * Date: 04/02/2026
 * Assignment: SDC330 Performance Assessment - Database
 * Description: This class represents an Address entity stored in the database.
 */

public class Address {
    private int id;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;

    public Address(int id, String street1, String street2, String city, String state, String zip) {
        this.id = id;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(String street1, String street2, String city, String state, String zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getStreet1() { return street1; }
    public String getStreet2() { return street2; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }

    public void setId(int id) { this.id = id; }

    // Display method
    public void printAddress() {
        System.out.println("Address " + id + ":");
        System.out.println(street1);

        if (street2 != null && !street2.isEmpty()) {
            System.out.println(street2);
        }

        System.out.println(city + ", " + state + " " + zip);
        System.out.println();
    }
}
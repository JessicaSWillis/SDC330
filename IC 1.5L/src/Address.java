/*
Jessica Willis
3/6/2026
1.5
In class assignment student person address
*/

public class Address {
    //variables 
    private String street;
    private String city;
    private String zipCode;

    // constructor or bust
    public Address(String street, String city, String zip) {
        setStreet(street);
        setCity(city);
        setZipCode(zip);
    }

    // getters and setters (love that java makes em for meeee)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // to string
    @Override
    public String toString() {
        return street + ", " + city + " " + zipCode;
    }

}

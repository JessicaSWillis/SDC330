/*
Jessica Willis
3/7/2026
Project phase 1
Rolodex App
*/

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Contact(String firstName, String lastName, String phone, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return firstName + " " + lastName + " | " + phone + " | " + email;
    }

}

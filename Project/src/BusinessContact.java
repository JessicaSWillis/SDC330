/*
Jessica Willis
3/7/2026
Project phase 1
Rolodex App
*/

public class BusinessContact extends Contact {
    private String company;
    private String jobTitle;

    public BusinessContact(String firstName, String lastName, String phone, String email, String company, String jobTitle) {
        super(firstName, lastName, phone, email);
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return super.toString() + " | Company: " + company + " | Title: " + jobTitle;
    }

}

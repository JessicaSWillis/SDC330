/**
 * Jessica Willis
 * 3/20/2026
 * 3.5
 */

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String id, String fName, String lName, double gpa) {
        setStudentId(id);
        setFirstName(fName);
        setLastName(lName);
        setGpa(gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

   @Override
   public String toString() {
    return "Student id: " + studentId + "\n" +
    "First Name: " + firstName + "\n" +
    "Last Name: " + lastName + "\n" +
    "GPA: " + String.format("%.2f", gpa);
   } 

}

/*
Jessica Willis
3/6/2026
GP 1.4
*/

public class Student {
    private String name;
    private String major;
    private double GPA;

    public Student(String name, String major, double gpa){
        this.name = name;
        this.major = major;
        GPA = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gpa){
        GPA = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%,2f%n", "Student: ", name, "Major: ", major, "GPA: ", GPA);
    }

}

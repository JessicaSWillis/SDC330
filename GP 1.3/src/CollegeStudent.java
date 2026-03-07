/*
Jessica Willis
3/6/2026
GP 1.3
*/

public class CollegeStudent extends Student {
    private String major;

    public CollegeStudent(String name, String school, String major) {
        super(name, school);
        this.major = major; 
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        major = this.major;
    }

    @Override
    public String getStudentInformation() {
        return String.format("%s%n%s%s", super.getStudentInformation(), "Student Major: ", major);
    }

     @Override
    public String toString() {
        return String.format("%s%n%s%s", super.toString(), "Student Major: ", major);
    }
}

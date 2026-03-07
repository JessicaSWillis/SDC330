/*
Jessica Willis
3/6/2026
GP 1.3
*/

public class Student {
    private String name;
    private String schoolName;
    
    public Student(String name, String school) {
        this.name = name;
        schoolName = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schName) {
        schoolName = schName;
    }

    public String getStudentInformation() {
        return String.format("%s%s%n%s%s", "Student Name: ", name, "School Name: ", schoolName);
    }

    @Override
    public String toString() {
        return getStudentInformation();
    }
}
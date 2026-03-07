/*
Jessica Willis
3/6/2026
GP 1.3
*/

public class PrimarySchoolStudent extends Student {
    private String grade;

    public PrimarySchoolStudent(String name, String school, String grade) {
        super(name, school);
        grade = this.grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setgrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String getStudentInformation() {
        return String.format("%s%n%s%S", super.getStudentInformation(), "Student Grade: ", grade);
    }

    @Override
    public String toString() {
        return getStudentInformation();
    }
}

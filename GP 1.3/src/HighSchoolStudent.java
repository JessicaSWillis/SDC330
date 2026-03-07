/*
Jessica Willis
3/6/2026
GP 1.3
*/

public class HighSchoolStudent extends Student {
    private int grade;
    private String className;
    private boolean isCollegePrep;

    public HighSchoolStudent(String name, String school, int grade, String clsName, boolean collPrep) {
        super(name, school);
        this.grade = grade;
        className = clsName;
        isCollegePrep = collPrep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String cls) {
        className = cls;
    }

    public boolean isCollegePrep() {
        return isCollegePrep;
    }

    public void setIsCollegePrep(boolean cp) {
        isCollegePrep = cp;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%d%n%s%s%n%s%s", getStudentInformation(), "Student Grade ", grade, "Student Class: ", className, "College Prep? ", isCollegePrep); 
    }
}

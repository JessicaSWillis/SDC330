/*
Jessica Willis
3/6/2026
GP 1.3
*/

public class GraduateStudent extends CollegeStudent {
    private boolean thesisRequired;

    public GraduateStudent(String name, String school, String major, boolean thesis) {
        super(name, school, major);
        thesisRequired = thesis;
    } 

    public boolean isThesisRequired() {
        return thesisRequired;
    }

    public void setThesisRequired(boolean thesisIsRequired) {
        thesisRequired = thesisIsRequired;
    }

    @Override
    public String getStudentInformation() {
        return String.format("%s%nZ%s%s", super.getStudentInformation(), "Thesis Required? ", thesisRequired);
    }

    @Override
    public String toString() {
        return String.format("%s%n%s%s", super.getStudentInformation(), "Thesis Required? ", thesisRequired);
    }
}

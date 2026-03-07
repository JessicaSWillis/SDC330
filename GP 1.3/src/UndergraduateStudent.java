/*
Jessica Willis
3/6/2026
GP 1.3
*/

public class UndergraduateStudent extends CollegeStudent {
    private String year;
    public UndergraduateStudent(String name, String school, String major, String year) {
        super(name, school, major);
        year = this.year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        year = this.year;
    }

    @Override
    public String getStudentInformation() {
        return String.format("%s%s%n%s%s%n%s%s%n%s%s", 
            "Student Name: ", getName(),
            "College Name: ", getSchoolName(), 
            "Student Year: ", year,
            "Student Major: ", getMajor());
    }

    @Override
    public String toString() {
        return getStudentInformation();
    }
    
}

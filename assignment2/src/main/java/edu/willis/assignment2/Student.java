package edu.willis.assignment2;

public class Student {
    private String studentName;
    private String courseName;
    private String favoriteTopic;
    private String semester; // NEW FIELD

    public Student() {
    }

    public Student(String studentName, String courseName, String favoriteTopic, String semester) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.favoriteTopic = favoriteTopic;
        this.semester = semester;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getFavoriteTopic() {
        return favoriteTopic;
    }

    public void setFavoriteTopic(String favoriteTopic) {
        this.favoriteTopic = favoriteTopic;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
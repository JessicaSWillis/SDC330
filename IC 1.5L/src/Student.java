/*
Jessica Willis
3/6/2026
1.5
In class assignment student person address
*/

import java.util.ArrayList;

public class Student extends Person {
    //variables
    private double gpa;
    private String major;
    private ArrayList<String> courseList;

    //constructor suckers, pulling from person and address classes
    public Student(String fullName, int idNumber, Address homeAddress, String major, double gpa) {
        super(fullName, idNumber, homeAddress);
        setMajor(major);
        setGpa(gpa);
        courseList = new ArrayList<>();
    }


    //getters and setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }

    // see below: and name them one by one
    public void addCourse(String courseName) {
        courseList.add(courseName);
    }

    // count the courses instead of blessings 
    public int getCourseCount() {
        return courseList.size();
    }

    // to string
    @Override
    public String toString() {
        return super.toString() +
            "\n Major: " + major +
            " | GPA: " + gpa + 
            " | Courses Completed: " + getCourseCount();
    }

}

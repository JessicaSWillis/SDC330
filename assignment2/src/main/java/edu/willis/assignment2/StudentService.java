package edu.willis.assignment2;


import java.util.ArrayList;

public class StudentService {

    private StudentStorage storage;

    public StudentService(StudentStorage storage) {
        this.storage = storage;
    }

    public boolean isValid(Student student) {
        return student.getStudentName() != null && !student.getStudentName().trim().isEmpty()
            && student.getCourseName() != null && !student.getCourseName().trim().isEmpty()
            && student.getFavoriteTopic() != null && !student.getFavoriteTopic().trim().isEmpty()
            && student.getSemester() != null && !student.getSemester().trim().isEmpty(); // New validation
    }

    public void addStudent(Student student) {
        storage.saveStudent(student);
    }

    public ArrayList<Student> getAllStudents() {
        return storage.getAllStudents();
    }
}

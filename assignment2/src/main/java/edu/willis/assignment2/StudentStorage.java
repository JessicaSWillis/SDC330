package edu.willis.assignment2;

import java.util.ArrayList;

public interface StudentStorage {
    void saveStudent(Student student);
    ArrayList<Student> getAllStudents();
}

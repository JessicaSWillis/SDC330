package edu.willis.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileStudentStorage implements StudentStorage {

    private static final String FILE_NAME = "students.txt";

    @Override
    public void saveStudent(Student student) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            writer.println(student.getStudentName() + "|" +
                           student.getCourseName() + "|" +
                           student.getFavoriteTopic() + "|" +
                           student.getSemester()); // Include new field
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                return students;
            }

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split("\\|");

                if (parts.length == 4) { // Updated for new field
                    Student student = new Student(parts[0], parts[1], parts[2], parts[3]);
                    students.add(student);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return students;
    }
}

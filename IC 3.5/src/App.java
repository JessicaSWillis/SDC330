/*
Jessica Willis
3/20/2026
3.5
*/

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 3.5 IC");
        Student originalStudent = new Student("S1001", "Jordan", "Smith", 3.45);
        writeStudentToFile(originalStudent);
        Student fileStudent = readStudentFromFile();
        System.out.println();
        System.out.println("Original Student Object");
        System.out.println(originalStudent);
        System.out.println("\nStudent object created from file:");
        if (fileStudent != null) {
            System.out.println(fileStudent);
        }
    }

    public static void writeStudentToFile(Student student) {
        try {
            PrintWriter writer = new PrintWriter("student.txt");
            writer.println(student.getStudentId());
            writer.println(student.getFirstName());
            writer.println(student.getLastName());
            writer.println(student.getGpa());
            writer.close();
            System.out.println("Successfully wrote student data to file");
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static Student readStudentFromFile() {
        try {
            File file = new File("Student.txt");
            Scanner scanner = new Scanner(file);
            String id = scanner.nextLine();
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            double gpa = Double.parseDouble(scanner.nextLine());
            scanner.close();
            System.out.println("Successfully read student data from the file");
            return new Student(id, firstName, lastName, gpa);
        } catch (FileNotFoundException  e) {
            System.out.println("Error: file not found");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return null;
    }
}

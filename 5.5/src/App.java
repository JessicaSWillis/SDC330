/*
Name: Jessica Willis
Date: 04/02/2026
Assignment: SDC330 Performance Assessment - Final Practical Exam
Description: Main application demonstrating inheritance, composition, polymorphism,
abstract classes, constructors, access specifiers, and file I/O.
*/

import java.util.*;
import java.io.*;

public class App {

    private static final String LOG_FILE = "yourname_log.txt";

    public static void main(String[] args) {
        System.out.println("Jessica WIllis - Week 5 Final Practical Exam");

        log("Application started");

        // Polymorphism + Inheritance
        ArrayList<Building> buildings = new ArrayList<>();

        // Use of Constructors
        buildings.add(new House("123 Main St", 3, 2));
        buildings.add(new House("456 Oak Ave", 4, 3));
        buildings.add(new House("789 Pine Rd", 2, 1));
        buildings.add(new House("321 Maple Dr", 5, 4));
        buildings.add(new House("654 Cedar Ln", 3, 2));

        log("Created building list");

        printIterative(buildings);
        log("Printed list iteratively");

        System.out.println("\nRecursive Output:");
        printRecursive(buildings, 0);
        log("Printed list recursively");

        System.out.println("\nLog File Contents:");
        readLog();
    }

    public static void printIterative(ArrayList<Building> list) {
        System.out.println("\nIterative Output:");
        for (Building b : list) {
            System.out.println(b);
        }
    }

    public static void printRecursive(ArrayList<Building> list, int index) {
        if (index >= list.size()) return;

        System.out.println(list.get(index));
        printRecursive(list, index + 1);
    }

    public static void log(String message) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            fw.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Error writing log");
        }
    }

    public static void readLog() {
        try (Scanner sc = new Scanner(new File(LOG_FILE))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Log file not found");
        }
    }
}
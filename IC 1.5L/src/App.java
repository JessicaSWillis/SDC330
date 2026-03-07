/*
Jessica Willis
3/6/2026
1.5
In class assignment student person address
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis - 1.5L");
        System.out.println();

        Scanner input = new Scanner(System.in);

        // get inputs from user
        System.out.print("Enter full name: ");
        String name = input.nextLine();
        System.out.print("Enter ID Number: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Major: ");
        String major = input.nextLine();
        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Street: ");
        String street = input.nextLine();
        System.out.print("Enter City: ");
        String city = input.nextLine();
        System.out.print("Enter Zip: ");
        String zipCode = input.nextLine();
        System.out.println();

        //instantiate new class bs
        Address address = new Address(street, city, zipCode);
        Student student = new Student(name, id, address, major, gpa);

        // loop for course names
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nEnter course #" + i + ": ");
            String course = input.nextLine();
            student.addCourse(course);
        }

        // update major
        System.out.println("\nUpdating Major to CyberSecurity\n");
        student.setMajor("Cybersecurity");

        //print final profile
        System.out.println("--- Final Student Profile ---");
        System.out.println(student.toString());

        //print course list
        System.out.println("\nIndividual Course List:");
        for(String course : student.getCourseList()) {
            System.out.println( " >> " + course);
        }
        input.close();
    }
}

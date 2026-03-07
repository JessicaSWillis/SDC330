/*
Jessica Willis
3/6/2026
GP 1.4
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis - 1.4");
        Student s1 = new Student("John Doe", "Psychology", 3.95);
        Student s2 = new Student("Jane Smith", "Biology", 3.28);
        Student s3 = new Student("Jessica Willis", "Software Development", 4.0);

        CollegeClass class1 = new CollegeClass("ENG123", "Intro to Poetry", new Professor("Robert Frost", "Dr.", "English"));
        Professor prof = new Professor("James Gosling", "Professor", "CIS");
        CollegeClass class2 = new CollegeClass("CIS319", "Java Programming", prof);

        class1.addStudent(s1);
        class1.addStudent(s2);
        class1.addStudent(s3);
        class1.addStudent("Jimmy Smith", "Chemistry", 2.56);
        class1.addStudent(new Student("Fred Flintstone", "Archeology", 2.3));

        class2.addStudent(s3);
        class2.addStudent("Rasmus Lerdorf", "Web Development", 3.6);
        class2.addStudent(new Student("Ada Lovelace", "Math", 3.99));

        System.out.println("CollegeClass class1 Unmodified");
        System.out.print(class1.getInfo());
        System.out.println("\nCollegeClass class2 Unmodified");
        System.out.print(class2.getInfo());
        class1.removeStudent("Fred Flintstone");
        System.out.println("\nCollegeClass class1 after removing Fred");
        System.out.print(class1.getInfo());
        System.out.println("\nExamples of class objects using toString");
        System.out.print("collegeClass object: ");
        System.out.println(class1);
        System.out.print("professor object: ");
        System.out.println(prof);
        System.out.print("student object: ");
        System.out.println(s3);
    }
}
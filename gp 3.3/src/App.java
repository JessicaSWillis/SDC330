/*
Jessica Willis
3/20/2026
gp 3.3
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 3.3");

        Person person = new Student("John Smith", 22, "js@email.com", 2022);
        System.out.println("Person printed useing Student's toString");
        System.out.println(person);
        person.setAge(43.5);
        System.out.println("Person printed using person getters");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getName());
        System.out.println("Email: " + person.getEmail());

        Student student = new Student("Jane Jones", 19, "jj@email.com", 2023);
        System.out.println("\nStudent printed using Student's toString");
        System.out.println(student);
        student.updateName("Jane Smith-Jones");
        student.updateAge(21.1);
        student.updateEmail("jsj@email.com");
        student.setGradYear(2023);

        System.out.println("Student printed using student & person getters");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Graduation Year: " + student.getGradYear());
    }
}

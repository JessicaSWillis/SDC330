/*
Jessica Willis
3/6/2026
GP 1.3
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis - 1.3");
        System.out.println("--------------------");
        Student s = new Student("John Smith", "Any School");
        System.out.println("***Student class using toString***");
        System.out.println(s);
        System.out.println("***Student class using getStudentInformation***");
        System.out.println(s.getStudentInformation());
        System.out.println();

        PrimarySchoolStudent pss = new PrimarySchoolStudent("Jane Doe", "Some Elementary School", "Pre-K");
        System.out.println("***PrimarySchoolStudent class using toString***");
        System.out.println(pss);
        System.out.println("***PrimarySchoolStudent class using getStudentInformation***");
        System.out.println(pss.getStudentInformation());
        System.out.println();

        HighSchoolStudent hss = new HighSchoolStudent("Fred Smythe", "Some High School", 10, "Sophmore", true);
        System.out.println("***HighSchoolStudent class using toString***");
        System.out.println(hss);
        System.out.println("***HighSchoolStudent class using getStudentInformation***");
        System.out.println(hss.getStudentInformation());
        System.out.println();

        CollegeStudent cs = new CollegeStudent("Jessica Willis", "ECPI", "Computer Science");
        System.out.println("***CollegeStudent class using toString***");
        System.out.println(cs);
        System.out.println("***CollegeStudent class using getStudentInformation***");
        System.out.println(cs.getStudentInformation());
        System.out.println();

        UndergraduateStudent us = new UndergraduateStudent("Jessica Willis", "ECPI", "Computer Science", "Junior");
        System.out.println("***UndergraduateStudent class using toString***");
        System.out.println(us);
        System.out.println("***UndergraduateStudent class using getStudentInformation***");
        System.out.println(us.getStudentInformation());
        System.out.println();

        GraduateStudent gs = new GraduateStudent("Dean Jones", "Tulane", "Psychology", true);
        System.out.println("***graduateStudent class using toString***");
        System.out.println(gs);
        System.out.println("***graduateStudent class using getStudentInformation***");
        System.out.println(gs.getStudentInformation());
        System.out.println();
    }
}

/*
Jessica Willis
3/6/2026
GP 1.4
*/
import java.util.ArrayList;

public class CollegeClass {
    private String classId;
    private String subject;
    private Professor instructor;
    private ArrayList<Student> roster;

    public CollegeClass(String id, String subj, Professor inst) {
        classId = id;
        subject = subj;
        instructor = inst;
        roster = new ArrayList<Student>();
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String val) {
        classId = val;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String val) {
        subject = val;
    }

    public Professor getInstructor() {
        return instructor;
    }

    public void setInstructor(Professor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    public void addStudent(Student val) {
        roster.add(val);
    }

    public void addStudent(String name, String major, double GPA) {
        roster.add(new Student(name, major, GPA));
    }

    public void removeStudent(String name) {
        roster.removeIf(n -> (n.getName().equalsIgnoreCase(name)));
    }

    public String formatInstructor() {
        return String.format("Instructor: %s %s frin the %s department.%n", 
            instructor.getTitle(),
            instructor.getName(),
            instructor.getDepartment());
    }

    public String getInfo() {
        String rval;
        rval = String.format("%s%s%n%s%s%n%s%n%s", 
            "Class Id: ", classId,
            "Subject: ", subject,
            "---------------",
            formatInstructor());
        rval += "\nCourse Roster:\n";
        for (Student student : roster) {
            rval += student;
            rval += "\n";
        }
        return rval;
    }


}

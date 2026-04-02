/*
Jessica willis
3/21/2026
ic 2.4
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 2.4");
        Teacher t1 = new Teacher("Amanda Reed", "Science", "Biology");
        Teacher t2 = new Teacher("Brian Cole", "Math", "Algebra");
        Counselor c1 = new Counselor("Tasha Green", "Student Services", "9th Grade");
        Counselor c2 = new Counselor("Mark Ellis", "Student Services", "12th grade");

        t1.startShift();
        t2.startShift();
        c1.startShift();
        c2.startShift();

        t2.endShift();

        t1.performTask("Grading lab reports");
        t2.performTask("perparing tomorrow's lesson");
        c1.performTask("meeting with new students");
        c2.performTask("reviewing graduation status");

        ArrayList<SchoolWorker> workers = new ArrayList<>();
        workers.add(t1);
        workers.add(t2);
        workers.add(c1);
        workers.add(c2);

        System.out.println("Workers printed from ArrayList\n");
        for (SchoolWorker worker : workers) {
            printWorker(worker);
        }

        System.out.println("Workers printed indiviually\n");
        printWorker(t1);
        printWorker(t2);
        printWorker(c1);
        printWorker(c2);
    }

    private static void printWorker(SchoolWorker worker) {
        System.out.println(worker.toString());
    }
}

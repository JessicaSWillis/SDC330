/*
Jessica Willis
3/21/2026
ic 2.4
*/

public class Teacher implements SchoolWorker{
    private String name;
    private String department;
    private String currentTask;
    private String subject;
    private boolean onDuty;

    public Teacher(String name, String department, String subject) {
        setName(name);
        setDepartment(department);
        setSubject(subject);
        setOnDuty(false);
        setCurrentTask("no task assigned");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(String currentTask) {
        this.currentTask = currentTask;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    @Override
    public void startShift() {
        setOnDuty(true);
    }

     @Override 
    public void endShift() {
        setOnDuty(false);
    }

    @Override
    public void performTask(String task) {
        setCurrentTask(task);
    }

    @Override
    public String toString() {
        String dutyStatus = onDuty ? "on duty" : "not on duty";
        return "Name: " + name +
            "\nDepartment: " + department +
            "\nSubject: " + subject +
            "\nThe teacher is " + dutyStatus +
            " and is currently " + currentTask + ".\n";
    }

}

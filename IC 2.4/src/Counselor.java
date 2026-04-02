/*
jessica willis
3/21/2026
ic 2.4
*/

public class Counselor implements SchoolWorker{
    private String name;
    private String department;
    private String currentTask;
    private String gradeLevel;
    private Boolean onDuty;

    public Counselor(String name, String department, String gradeLevel) {
        setName(name);
        setDepartment(department);
        setGradeLevel(gradeLevel);
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

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Boolean getOnDuty() {
        return onDuty;
    }

    public void setOnDuty(Boolean onDuty) {
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
            "\nGrade Level: " + gradeLevel +
            "\nThe counselor is " + dutyStatus +
            " and is currently " + currentTask + ".\n";
    }

}

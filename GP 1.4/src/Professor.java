/*
Jessica Willis
3/6/2026
GP 1.4
*/

public class Professor {
    private String name;
    private String title;
    private String department;

    public Professor(String name, String title, String dept) {
        this.name = name;
        this.title = title;
        department = dept;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String dept){
        department = dept;
    }

}

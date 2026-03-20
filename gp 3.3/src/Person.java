/*
jessica willis
3/20/26
gp 3.3
*/

public class Person {
    private String name;
    private double age;
    private String email;

    protected Person(String name, double age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    protected void setAge(double age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    

}

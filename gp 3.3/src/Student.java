/*
Jessica willis
3/20/2026
gp 3.3
*/

public class Student extends Person{
    private int gradYear;

    public Student(String name, double age, String email, int gradYear) {
        super(name, age, email);
        this.gradYear = gradYear;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void updateName(String name) {
        setName(name);
    }
    public void updateAge(double age) {
        setAge(age);
    }
    public void updateEmail(String email) {
        setEmail(email);
    }

    @Override
    public String toString() {
        return "Strudent Information for " + getName() + "\n" +
        " Age: " + getAge() + "\n" + " Email: " + getEmail() + "\n" +
        " Graduation Year: " + gradYear + "\n";
    }

}

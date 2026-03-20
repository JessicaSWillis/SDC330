/*
Jessica Willis
3/20/2026
gp 2.3
*/

public class Cat implements Animal{
    private String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String makeSound() {
        return "Meow meow meow meow";
    }
    @Override
    public void move(String start, String end) {
        System.out.println("Leaping from " + start + " to " + end);
    }
    @Override
    public String toString() {
        return String.format("Cat Informat:%nName: %s%n", name);
    }
}

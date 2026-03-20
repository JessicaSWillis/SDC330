/*
Jessica Willis
2/20/26
gp 3.2
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis gp 3.2");
        Shape shape = new Square("Orange", "Red", 5.0);
        System.out.println(shape);
        shape = new Rectangle("Green", "Black", 5.5, 2.5);
        System.out.println(shape);
        shape = new Rhombus("Purple", "Red", 1.7, 3);
        System.out.println(shape);
        shape = new Circle("Blue", "Red", 3.4);
        System.out.println(shape);

        Square square = new Square("Chartreuse", "Forest Green", 11.2);
        System.out.println(square);
        Rectangle rect = new Rectangle("Grey", "gray", 3.2, 5.5);
        System.out.println(rect);
        Rhombus para = new Rhombus("Yellow", "Orange", 2.9, 4.7);
        System.out.println(para);
        Circle circle = new Circle("Cyan", "Brown", 11.234);
        System.out.println(circle);
    }
}

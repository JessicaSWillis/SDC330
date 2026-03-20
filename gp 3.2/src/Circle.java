/*
jessica willis
3/20/2026
gp 3.2
*/

public class Circle extends Shape{
    private double radius;

    public Circle(String fillColor, String lineColor, double radius) {
        super(fillColor, lineColor);
        this.radius = radius;
    }

    public String areaFormula() {
        return "Pi times the radius squares (π x r2)";
    }

    public double area() {
        return Math.PI * (radius * radius);
    }
}

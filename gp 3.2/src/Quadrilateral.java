/*
jessica willis
3/20/2026
gp 3.2
*/

public abstract class Quadrilateral extends Shape {
    private double length1;
    private double length2;

    public Quadrilateral(String fillColor, String lineColor, double l1, double l2) {
        super(fillColor, lineColor);
        length1 = l1;
        length2 = l2;
    }

    public abstract String areaFormula();

    public double area() {
        return length1 * length2;
    }

}

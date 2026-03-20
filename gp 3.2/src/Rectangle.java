/*
Jessica Willis
3/20/26
gp 3.2
*/


public class Rectangle extends Quadrilateral{
    public Rectangle(String fillColor, String lineColor, double length1, double length2) {
        super(fillColor, lineColor, length1, length2);
    }

    public String areaFormula() {
        return "Length times Width (1 x w).";
    }

}

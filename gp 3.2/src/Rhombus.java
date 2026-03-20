/*
Jessica willis
3/20/2026
gp 3.2
*/

public class Rhombus extends Quadrilateral{
    public Rhombus(String fillColor, String lineColor, double d1, double d2) {
        super(fillColor, lineColor, d1, d2);
    }

    public String areaFormula() {
        return "One half diagonal 1 time diagonal 2 (d1xd2)/2.";
    }

    @Override
    public double area() {
        return super.area()/2;
    }

}

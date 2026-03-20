/*
jessica willis
3/20/26
gp 2.3
*/

public class Square extends Quadrilateral{
    public Square(String fillColor, String lineColor, double length) {
        super(fillColor, lineColor, length, length);
    }

    public String areaFormula() {
        return "Length squared (l^2).";
    }
}

/*
jessica willis
3/20/2026
gp 3.2
*/

public abstract class Shape {
    private String fillColor;
    private String lineColor;

    public Shape(String fill, String line) {
        fillColor = fill;
        lineColor = line;
    }

    public abstract String areaFormula();
    public abstract double area();

    @Override
    public String toString() {
        return "Shape's Properties:\n" + " Type: " + getClass().getName() + "\n" +
        " Area Formula: " + areaFormula() + "\n" + " Area: " + String.format("%.3f", area()) + "\n" +
        " Fill Color: " + fillColor + "\n" + " Line Color: " + lineColor + "\n";
    }
}

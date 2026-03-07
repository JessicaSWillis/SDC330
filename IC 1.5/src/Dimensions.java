/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: In-Class Assignment 1: Mandatory Composition
 * Description: Represents the physical dimensions of a device (height x width x depth).
 */
public class Dimensions {
    private double height;
    private double width;
    private double depth;

    // Constructor using setters
    public Dimensions(double height, double width, double depth) {
        setHeight(height);
        setWidth(width);
        setDepth(depth);
    }

    // Getters and Setters
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getDepth() { return depth; }
    public void setDepth(double depth) { this.depth = depth; }

    // toString override
    @Override
    public String toString() {
        return getHeight() + "in x " + getWidth() + "in x " + getDepth() + "in";
    }
}

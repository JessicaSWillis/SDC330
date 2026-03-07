/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 * Description: Represents a bicycle with gears, seat height, and tire size.
 */
public class Bicycle extends Vehicle {
    // Private member variables
    private int gears;
    private double seatHeight;
    private double tireSize;

    // Constructor
    public Bicycle(int wheels, String color, boolean moving, int seats, int gears, double seatHeight, double tireSize) {
        super(wheels, color, moving, seats);
        this.gears = gears;
        this.seatHeight = seatHeight;
        this.tireSize = tireSize;
    }

    // Getters and Setters
    public int getGears() { return gears; }
    public void setGears(int gears) { this.gears = gears; }

    public double getSeatHeight() { return seatHeight; }
    public void setSeatHeight(double seatHeight) { this.seatHeight = seatHeight; }

    public double getTireSize() { return tireSize; }
    public void setTireSize(double tireSize) { this.tireSize = tireSize; }

    // toString method (use super.toString())
    @Override
    public String toString() {
        return super.toString() + ", Bicycle [Gears=" + gears + ", SeatHeight=" + seatHeight + ", TireSize=" + tireSize + "]";
    }
}
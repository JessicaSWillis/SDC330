/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 * Description: Represents a motorized vehicle with engine and transmission.
 */
public class Motorized extends Vehicle {
    // Private member variables
    private String engine;
    private boolean automatic;

    // Constructor
    public Motorized(int wheels, String color, boolean moving, int seats, String engine, boolean automatic) {
        super(wheels, color, moving, seats);
        this.engine = engine;
        this.automatic = automatic;
    }

    // Getters and Setters
    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }

    public boolean isAutomatic() { return automatic; }
    public void setAutomatic(boolean automatic) { this.automatic = automatic; }

    // toString method (DO NOT call super.toString())
    @Override
    public String toString() {
        return "Motorized [Wheels=" + getWheels() + ", Color=" + getColor() + ", Moving=" + isMoving() + ", Seats=" + getSeats()
                + ", Engine=" + engine + ", Automatic=" + automatic + "]";
    }
}
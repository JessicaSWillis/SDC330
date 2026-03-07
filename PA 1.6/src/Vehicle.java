/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: SDC330 Performance Assessment - Inheritance
 * Description: Superclass representing a general vehicle.
 */
public class Vehicle {
    // Private member variables
    private int wheels;
    private String color;
    private boolean moving;
    private int seats;

    // Constructor
    public Vehicle(int wheels, String color, boolean moving, int seats) {
        this.wheels = wheels;
        this.color = color;
        this.moving = moving;
        this.seats = seats;
    }

    // Getters and Setters
    public int getWheels() { return wheels; }
    public void setWheels(int wheels) { this.wheels = wheels; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isMoving() { return moving; }
    public void setMoving(boolean moving) { this.moving = moving; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }

    // toString method
    @Override
    public String toString() {
        return "Vehicle [Wheels=" + wheels + ", Color=" + color + ", Moving=" + moving + ", Seats=" + seats + "]";
    }
}


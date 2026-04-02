/*
Jessica Willis
Date of development: 04/02/2026
Assignment: SDC330 Performance Assessment - Constructors and Access Specifiers
Description: Superclass representing a generic car with private fuel and engine properties.
*/
public class Car {
    private String fuel;
    private String engine;

    protected Car(String fuel, String engine) {
        this.fuel = fuel;
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    protected void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngine() {
        return engine;
    }

    protected void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return String.format("%s (Engine: %s, Fuel: %s)",
                this.getClass().getSimpleName(),
                getEngine(),
                getFuel());
    }
}


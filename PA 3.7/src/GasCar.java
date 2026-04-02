/*
Jessica Willis
Date of development: 04/02/2026
Assignment: SDC330 Performance Assessment - Constructors and Access Specifiers
Description: Gas-powered car subclass with overloaded constructors and method to update fuel.
*/


public class GasCar extends Car {

    // Public 2-parameter constructor
    public GasCar(String fuel, String engine) {
        super(fuel, engine);
    }

    // Public 1-parameter constructor; use a default fuel type
    public GasCar(String engine) {
        super("Gasoline", engine);
    }

    // Public method to update the fuel type (uses protected setter from Car)
    public void updateFuel(String newFuel) {
        setFuel(newFuel);
    }
}


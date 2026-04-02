/*
Jessica Willis
Date of development: 04/02/2026
Assignment: SDC330 Performance Assessment - Constructors and Access Specifiers
Description: Main application that demonstrates constructors, access specifiers, and parking lot usage.
*/
public class App {
    public static void main(String[] args) {
        System.out.println("Jessica Willis - Week 3 Constructors and Access Specifiers Performance Assessment");

        ParkingLot lot = new ParkingLot();

        // Create an ElectricCar and add it
        ElectricCar eCar = new ElectricCar();
        lot.addCar(eCar);

        // Create a GasCar using 2-parameter constructor and add it
        GasCar gCar2 = new GasCar("Premium Gasoline", "V8");
        lot.addCar(gCar2);

        // Create a GasCar using 1-parameter constructor and add it
        GasCar gCar1 = new GasCar("I4 Turbo");
        lot.addCar(gCar1);

        // Optionally demonstrate updateFuel
        gCar1.updateFuel("E85"); // updates fuel via protected setter in Car

        System.out.println("Cars in the Parking Lot:");
        System.out.print(lot.toString());
    }
}


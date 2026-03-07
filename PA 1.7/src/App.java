/*
Jessica Willis
3/6/2026
1.7
*/

public class App {
    public static void main(String[] args) {
        System.out.println("Jessica Willis - Week 1 Composition Performance Assessment");

        // Create Engine objects
        Engine fordEngine = new Engine(6, "Unleaded 87", true);
        Engine jaguarEngine = new Engine(8, "Premium 91", true);

        // Create Automobile objects
        Automobile fordCar = new Automobile("Ford", "Explorer", "Blue", "SUV", fordEngine);
        Automobile jaguarCar = new Automobile("Jaguar", "XF", "Red", "Sedan", jaguarEngine);

        // Add tires using Tire objects
        fordCar.addTire(new Tire("Pirelli", "225/65R17", 35, 28, "All Season Radial"));
        fordCar.addTire(new Tire("Pirelli", "225/65R17", 35, 28, "All Season Radial"));

        // Add tires using parameters
        fordCar.addTire("Michelin", "225/65R17", 35, 28, "All Season Radial");
        fordCar.addTire("Michelin", "225/65R17", 35, 28, "All Season Radial");

        jaguarCar.addTire(new Tire("Continental", "245/45R19", 40, 32, "Performance"));
        jaguarCar.addTire("Continental", "245/45R19", 40, 32, "Performance");

        // Print one instance using toString
        System.out.println("\nFord Car Full Info:");
        System.out.println(fordCar.toString());

        // Print basic info
        System.out.println("\nFord Car Basic Info:");
        System.out.println(fordCar.getBasicInfo());

        // Print all get methods info for Ford Car
        System.out.println("\nFord Car Detailed Properties:");
        System.out.println("Make: " + fordCar.getMake());
        System.out.println("Model: " + fordCar.getModel());
        System.out.println("Color: " + fordCar.getColor());
        System.out.println("Body Style: " + fordCar.getBodyStyle());
        System.out.println("Engine Info: " + fordCar.getEngine().toString());
        System.out.println("Number of Cylinders: " + fordCar.getEngine().getCylinders());
        System.out.println("Approved Gas Type: " + fordCar.getEngine().getGasType());
        System.out.println("Fuel Injected?: " + fordCar.getEngine().isFuelInjected());

        System.out.println("Tire Information:");
        for (Tire tire : fordCar.getTires()) {
            System.out.println("\tManufacturer: " + tire.getManufacturer());
            System.out.println("\tTire Size: " + tire.getSize());
            System.out.println("\tMax Pressure: " + tire.getMaxPressure());
            System.out.println("\tMin Pressure: " + tire.getMinPressure());
            System.out.println("\tType: " + tire.getType());
            System.out.println();
        }
    }
}
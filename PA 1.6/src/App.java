/**
 * Name: Jessica Willis
 * Date: 3/6/2016
 * Assignment: SDC330 Performance Assessment - Inheritance
**/
public class App {
    public static void main(String[] args) {
        System.out.println("Jessica Willis - Week 1 Inheritance Performance Assessment");

        // Create instances
        Vehicle vehicle = new Vehicle(4, "Red", false, 4);
        Motorized motorized = new Motorized(4, "Blue", true, 2, "2.0L I4", true);
        Bicycle bicycle = new Bicycle(2, "Green", false, 1, 18, 1.0, 26.0);
        Car car = new Car(4, "Black", false, 5, "3.0L V6", true, true, "Small Trunk");
        Truck truck = new Truck(6, "White", true, 2, "5.0L V8", false, "2 ton", true);

        // Print toString for each
        System.out.println(vehicle.toString());
        System.out.println(motorized.toString());
        System.out.println(bicycle.toString());
        System.out.println(car.toString());
        System.out.println(truck.toString());

        // Print Car properties individually using getters
        System.out.println("Car Details:");
        System.out.println("Color: " + car.getColor());
        System.out.println("Number of Seats: " + car.getSeats());
        System.out.println("Engine Size: " + car.getEngine());
        System.out.println("Automatic Transmission: " + car.isAutomatic());
        System.out.println("Sun Roof: " + car.hasSunRoof());
        System.out.println("Storage Capacity: " + car.getStorage());
    }
}

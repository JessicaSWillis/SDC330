/*
jessica willis
3/21/2026
2.6
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("jessica willis 2.6");
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");
        CargoTruck truck1 = new CargoTruck("Ford", "F-150", "5 cubic tons");
        CargoTruck truck2 = new CargoTruck("Volvo", "FH16", "10 cubic tons");
        car1.start();
        car2.start();
        truck1.start();
        truck2.start();
        car2.stop();
        car1.drive("Downtown");
        car2.drive("Airport");
        truck1.drive("Warehouse District");
        truck2.drive("Harbor");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(truck1);
        vehicles.add(truck2);

        System.out.println("Vehicles from ArrayList:\n");
        for (Vehicle v : vehicles) {
            printVehicle(v);
        }

        System.out.println("Vehicles printed individually");
        printVehicle(car1);
        printVehicle(car2);
        printVehicle(truck1);
        printVehicle(truck2);
    }

    private static void printVehicle(Vehicle v) {
        System.out.println(v.toString());
    }
}

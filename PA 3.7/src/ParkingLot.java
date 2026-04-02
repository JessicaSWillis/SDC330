/*
Jessica WIllis
Date of development: 04/02/2026
Assignment: SDC330 Performance Assessment - Constructors and Access Specifiers
Description: Composition class that holds a list of Car objects.
*/
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final ArrayList<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return new ArrayList<>(cars); // return copy to protect internal list
    }

    public void addCar(Car car) {
        if (car != null) {
            cars.add(car);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car c : cars) {
            sb.append(c.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}

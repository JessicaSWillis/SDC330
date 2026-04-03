/*
Name: Jessica Willis
Date: 04/02/2026
Assignment: SDC330 Performance Assessment - Final Practical Exam
Description: Represents a house building.
Demonstrates: Inheritance, Composition, Constructors, Polymorphism
*/

public class House extends Building {

    // Composition (House HAS-A RoomInfo)
    private RoomInfo roomInfo;

    public House(String address, int bedrooms, int bathrooms) {
        super("House", address); // Inheritance
        this.roomInfo = new RoomInfo(bedrooms, bathrooms);
    }

    @Override
    public String getDetails() {
        return "Type: " + type + ", Address: " + address + ", " + roomInfo;
    }
}
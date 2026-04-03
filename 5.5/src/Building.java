/*
Name: Jessica Willis
Date: 04/02/2026
Assignment: SDC330 Performance Assessment - Final Practical Exam
Description: Abstract base class for all buildings.
Demonstrates: Abstract Classes, Inheritance, Access Specifiers
*/

public abstract class Building {

    protected String type;
    protected String address;

    public Building(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public abstract String getDetails();

    public String toString() {
        return getDetails();
    }
}
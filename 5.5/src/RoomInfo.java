/*
Name: Jessica Willis
Date: 04/02/2026
Assignment: SDC330 Performance Assessment - Final Practical Exam
Description: Represents room details for a house.
Demonstrates: Composition, Constructors, Access Specifiers
*/

public class RoomInfo {

    // private access specifier
    private int bedrooms;
    private int bathrooms;

    public RoomInfo(int bedrooms, int bathrooms) {
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public String toString() {
        return "Bedrooms: " + bedrooms + ", Bathrooms: " + bathrooms;
    }
}

/*
Jessica Willis
3/21/2026
2.5
*/
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 2.5");
        Building b1 = new Building("100 main street", 3, "Brick");
        Condominium c1 = new Condominium("200 Oak Ave", 5, "Concrete", 20);
        House h1 = new House("300 Pine rd", 2, "wood", "Blue", 6);
        SplitLevel s1 = new SplitLevel("400 Maple Dr", "Vinyl", "Green", 7, true);
        SplitLevel s2 = new SplitLevel("500 cedar Ln", "Stone", "red", 5, false);

        ArrayList<Building> buildings = new ArrayList<>();
        buildings.add(b1);
        buildings.add(c1);
        buildings.add(h1);
        buildings.add(s1);
        buildings.add(s2);

        ArrayList<House> houses = new ArrayList<>();
        houses.add(h1);
        houses.add(s1);
        houses.add(s2);

        System.out.println("All Buildings:\n");
        for (Building b : buildings) {
            printBuilding(b);
        }

        System.out.println("Houses only:\n");
        for(House h : houses){
            printBuilding(h);
        }
    }

    private static void printBuilding(Building b) {
        System.out.println(b.toString());
    }
}

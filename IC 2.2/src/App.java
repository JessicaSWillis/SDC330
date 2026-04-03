/*
Jessica Willis
3/28/2026
2.2
*/

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis - 2.2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pizza order 1 name: ");
        String p1Name = scanner.nextLine();
        System.out.println("Enter pizza size: ");
        String p1Size = scanner.nextLine();


        PizzaOrder pizza1 = new PizzaOrder(p1Name, p1Size);


        System.out.println("Enter Pizza Order 2 Name: ");
        String p2Name = scanner.nextLine();
        System.out.println("Enter Pizza Size: ");
        String p2Size = scanner.nextLine();

        PizzaOrder pizza2 = new PizzaOrder(p2Name, p2Size);

        System.out.println("Enter Grocery item 1 name: ");
        String g1Name = scanner.nextLine();
        System.out.println("Enter Grocery Order Size: ");
        String g1Size = scanner.nextLine();

        GroceryOrder grocery1 = new GroceryOrder(g1Name, g1Size);

        System.out.println("Enter Grocery item 2 name: ");
        String g2Name = scanner.nextLine();
        System.out.println("Enter Grocery Order Size: ");
        String g2Size = scanner.nextLine();

        GroceryOrder grocery2 = new GroceryOrder(g2Name, g2Size);

        System.out.println("Enter destination for pizza 1: ");
        pizza1.assignDestination(scanner.nextLine());
        System.out.println("Enter destination for pizza 2: ");
        pizza2.assignDestination(scanner.nextLine());
        System.out.println("Enter destination from grocery 1: ");
        grocery1.assignDestination(scanner.nextLine());
        System.out.println("Enter destination for grocery 2: ");
        grocery2.assignDestination(scanner.nextLine());

        pizza1.markPrepared();
        pizza2.markPrepared();
        grocery1.markPrepared();
        grocery2.markPrepared();
        pizza1.markDelivered();
        grocery1.markDelivered();

        ArrayList<Deliverable> deliveries = new ArrayList<>();
        deliveries.add(pizza1);
        deliveries.add(pizza2);
        deliveries.add(grocery1);
        deliveries.add(grocery2);

        System.out.println("\n=== Delivery items ===");
        for (Deliverable item : deliveries) {
            printItem(item);
        }

        scanner.close();

    }

    private static void printItem(Deliverable item) {
        System.out.println(item.toString());
    }
}

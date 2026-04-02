
/**
 * Jessica Willis
 * 3/27/2026
 * ic 4.5
 * main class
 */

import java.sql.Connection;

public class App {
    public static void main(String[] args) {

        System.out.println("Jessica Willis IC 4.5");

        Connection conn = SQLiteDatabase.connect("Products.db");

        ProductDb db = new ProductDb();

        db.createTable(conn);

        db.addProduct(new Product("Laptop", "Electronics", 899.99), conn);
        db.addProduct(new Product("Desk Chair", "Furniture", 149.50), conn);
        db.addProduct(new Product("Water Bottle", "Fitness", 24.99), conn);
        db.addProduct(new Product("Notebook", "School Supplies", 3.49), conn);

        System.out.println("All products in the database");
        for (Product p : db.getAllProducts(conn)) {
            printProduct(p);
        }

        System.out.println("\nGet a Product using an invalid id");
        printProduct(db.getProductById(-5, conn));

        Product updated = new Product(2, "Office Chair", "Furniture", 179.99);
        db.updateProduct(updated, conn);

        System.out.println("\nUpdated Product");
        printProduct(db.getProductById(2, conn));

        db.deleteProduct(2, conn);

        System.out.println("\nAll Products in the Database after Delete");
        for (Product p : db.getAllProducts(conn)) {
            printProduct(p);
        }
    }

    private static void printProduct(Product p) {
        System.out.println("Product ID: " + p.getId());
        System.out.println("Name: " + p.getProductName());
        System.out.println("Category: " + p.getCategory());
        System.out.println("Price: $" + p.getPrice() + "\n");
    }
}
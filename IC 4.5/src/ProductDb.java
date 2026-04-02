/**
 * Jessica Willis
 * 3/27/2026
 * ic 4.5
 * product database class
 */

import java.sql.*;
import java.util.ArrayList;

public class ProductDb {
    public void createTable(Connection conn) {
        String sql = "CREATE TABLE IF NOT EXISTS Products (" +
             "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
             "ProductName TEXT, " +
             "Category TEXT, " +
             "Price REAL);";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addProduct(Product product, Connection conn) {
        String sql = "INSERT INTO Products(productName, category, price) VALUES(?,?,?)";
        try(PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, product.getProductName());
            pst.setString(2, product.getCategory());
            pst.setDouble(3, product.getPrice());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateProduct(Product product, Connection conn) {
        String sql = "UPDATE Products SET productName=?, category=?, price=? WHERE id=?";
        try(PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, product.getProductName());
            pst.setString(2, product.getCategory());
            pst.setDouble(3, product.getPrice());
            pst.setInt(4, product.getId());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteProduct(int id, Connection conn) {
        String sql= "DELETE FROM Products WHERE id=?";
        try(PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst. executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Product getProductById(int id, Connection conn) {
        String sql = "SELECT * FROM Products WHERE id=?";
         try(PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                return new Product(
                    rs.getInt("ID"),
                    rs.getString("ProductName"),
                    rs.getString("Category"),
                    rs.getDouble("Price")
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return new Product(id, "Not Found", "Not found", -1.0);

    }

    public ArrayList<Product> getAllProducts(Connection conn) {
        ArrayList<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM Products";
        try(Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                products.add(new Product(
                    rs.getInt("ID"),
                    rs.getString("ProductName"),
                    rs.getString("Category"),
                    rs.getDouble("Price")
                ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}

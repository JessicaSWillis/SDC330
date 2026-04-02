/*
Jessica willis
3/27/2026
ic 4.5
product class
*/

public class Product {
    private int id;
    private String productName;
    private String category;
    private double price;

    public Product() {}

    public Product(int id, String productName, String category, double price) {
        setId(id);
        setProductName(productName);
        setCategory(category);
        setPrice(price);
    }

    public Product(String productName, String category, double price) {
        setProductName(productName);
        setCategory(category);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

}

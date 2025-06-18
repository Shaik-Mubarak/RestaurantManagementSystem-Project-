// application/MenuItem.java
package application;

public class MenuItem {
    private int id;
    private String name;
    private double price;
    private int quantity; // Assuming quantity might be relevant for some view, though often it's an order item quantity

    // Constructor
    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = 0; // Default or initialize as needed
    }

    public MenuItem(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() { // Make sure this getter exists if you use it in TableView
        return quantity;
    }

    // Setters (if needed, though not strictly required by PropertyValueFactory for display)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MenuItem [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}

// application/OrderItem.java (No changes needed here for this specific issue)
package application;

public class OrderItem {
    private int menuItemId;
    private String itemName;
    private int quantity;
    private double priceAtOrder;

    public OrderItem(int menuItemId, String itemName, int quantity, double priceAtOrder) {
        this.menuItemId = menuItemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.priceAtOrder = priceAtOrder;
    }

    // Getters
    public int getMenuItemId() {
        return menuItemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPriceAtOrder() {
        return priceAtOrder;
    }

    // Setters (if needed)
    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPriceAtOrder(double priceAtOrder) {
        this.priceAtOrder = priceAtOrder;
    }

    @Override
    public String toString() {
        return "OrderItem [menuItemId=" + menuItemId + ", itemName=" + itemName + ", quantity=" + quantity + ", priceAtOrder=" + priceAtOrder + "]";
    }
}

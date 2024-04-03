public class SalesTransaction {
    private int id;
    private Product product;
    private int quantity;
    private double price;
    private double total;

    // Constructor
    public SalesTransaction(int id, Product product, int quantity, double price) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.total = quantity * price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateTotal();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        updateTotal();
    }

    public double getTotal() {
        return total;
    }

    // Method to update total based on quantity and price
    private void updateTotal() {
        total = quantity * price;
    }

    // toString method for debugging/logging
    @Override
    public String toString() {
        return "SalesTransaction{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}

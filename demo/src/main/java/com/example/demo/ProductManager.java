import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    // Constructor
    public ProductManager() {
        this.products = new ArrayList<>();
    }

    // Method to fetch all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Method to fetch a product by ID
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null; // Product not found
    }

    // Method to create a new product
    public void createProduct(String name, String description, String category, int initialQuantity, double price) {
        int id = products.size() + 1; // Generate a new ID
        Date creationDate = new Date(); // Current date
        Product product = new Product(id, name, description, category, creationDate, initialQuantity, price);
        products.add(product);
    }

    // Method to update an existing product
    public void updateProduct(int id, String name, String description, String category, int quantity, double price) {
        Product product = getProductById(id);
        if (product != null) {
            product.setName(name);
            product.setDescription(description);
            product.setCategory(category);
            product.setAvailableQuantity(quantity);
            product.setPrice(price);
        }
    }

    // Method to delete a product by ID
    public void deleteProduct(int id) {
        Product product = getProductById(id);
        if (product != null) {
            products.remove(product);
        }
    }
}

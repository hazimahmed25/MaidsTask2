import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private List<Product> products;
    private List<Client> clients;
    private List<Sale> sales;

    // Constructor
    public DatabaseManager() {
        this.products = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.sales = new ArrayList<>();
    }

    // Product operations

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        Product existingProduct = getProductById(product.getId());
        if (existingProduct != null) {
            int index = products.indexOf(existingProduct);
            products.set(index, product);
        }
    }

    public void deleteProduct(int id) {
        Product product = getProductById(id);
        if (product != null) {
            products.remove(product);
        }
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Client operations

    public void addClient(Client client) {
        clients.add(client);
    }

    public void updateClient(Client client) {
        Client existingClient = getClientById(client.getId());
        if (existingClient != null) {
            int index = clients.indexOf(existingClient);
            clients.set(index, client);
        }
    }

    public void deleteClient(int id) {
        Client client = getClientById(id);
        if (client != null) {
            clients.remove(client);
        }
    }

    public Client getClientById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    // Sale operations

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public void deleteSale(int id) {
        Sale sale = getSaleById(id);
        if (sale != null) {
            sales.remove(sale);
        }
    }

    public Sale getSaleById(int id) {
        for (Sale sale : sales) {
            if (sale.getId() == id) {
                return sale;
            }
        }
        return null;
    }
}

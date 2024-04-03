import java.util.ArrayList;
import java.util.List;

public class ClientManager {
    private List<Client> clients;

    // Constructor
    public ClientManager() {
        this.clients = new ArrayList<>();
    }

    // Method to fetch all clients
    public List<Client> getAllClients() {
        return clients;
    }

    // Method to fetch a client by ID
    public Client getClientById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null; // Client not found
    }

    // Method to create a new client
    public void createClient(String name, String lastName, String mobile, String email, String address) {
        int id = clients.size() + 1; // Generate a new ID
        Client client = new Client(id, name, lastName, mobile, email, address);
        clients.add(client);
    }

    // Method to update an existing client
    public void updateClient(int id, String name, String lastName, String mobile, String email, String address) {
        Client client = getClientById(id);
        if (client != null) {
            client.setName(name);
            client.setLastName(lastName);
            client.setMobile(mobile);
            client.setEmail(email);
            client.setAddress(address);
        }
    }

    // Method to delete a client by ID
    public void deleteClient(int id) {
        Client client = getClientById(id);
        if (client != null) {
            clients.remove(client);
        }
    }
}

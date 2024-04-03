import java.util.HashMap;
import java.util.Map;

public class AuthenticationManager {
    private Map<String, String> users; // Map of username to password
    
    // Constructor
    public AuthenticationManager() {
        users = new HashMap<>();
        // In a real-world scenario, user credentials would likely be stored securely in a database.
        // For simplicity, we're hardcoding some sample user credentials here.
        users.put("admin", "admin123"); // Sample admin user
    }
    
    // Method to authenticate a user
    public boolean authenticate(String username, String password) {
        // Check if the username exists in the users map
        if (users.containsKey(username)) {
            // If the username exists, check if the provided password matches the stored password
            String storedPassword = users.get(username);
            return password.equals(storedPassword);
        }
        return false; // Username does not exist
    }
}

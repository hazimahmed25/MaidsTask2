import java.util.Date;

public class Auditor {
    
    // Method to track changes made to product price
    public static void trackProductPriceChange(Product product, double oldPrice, double newPrice) {
        System.out.println(new Date() + " - Product price change: " + product.getName() + " (ID: " + product.getId() + ") - Old price: " + oldPrice + ", New price: " + newPrice);
    }

    // Method to track changes made to client information
    public static void trackClientInformationUpdate(Client client, String oldInfo, String newInfo) {
        System.out.println(new Date() + " - Client information update: " + client.getName() + " (ID: " + client.getId() + ") - Old information: " + oldInfo + ", New information: " + newInfo);
    }

}

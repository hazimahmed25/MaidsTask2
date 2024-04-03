import java.util.Date;

public class Logger {
    
    // Method to log important system activities
    public static void logActivity(String activity) {
        System.out.println(new Date() + " - " + activity);
    }

    // Method to log product updates
    public static void logProductUpdate(Product product, String updateType) {
        System.out.println(new Date() + " - Product " + updateType + ": " + product.getName());
    }

    // Method to log client updates
    public static void logClientUpdate(Client client, String updateType) {
        System.out.println(new Date() + " - Client " + updateType + ": " + client.getName());
    }

    // Method to log sales operations
    public static void logSalesOperation(Sale sale, String operationType) {
        System.out.println(new Date() + " - Sales " + operationType + ": " + sale.getId());
    }

    // Method to log reporting activities
    public static void logReportingActivity(String reportType) {
        System.out.println(new Date() + " - Reporting: " + reportType);
    }

}

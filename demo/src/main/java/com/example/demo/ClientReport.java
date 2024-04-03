import java.util.List;
import java.util.Map;

public class ClientReport {
    private int totalNumberOfClients;
    private List<Client> topSpendingClients;
    private Map<String, Integer> clientActivity;
    private Map<String, Integer> clientLocationStatistics;

    // Constructor
    public ClientReport(int totalNumberOfClients, List<Client> topSpendingClients, Map<String, Integer> clientActivity, Map<String, Integer> clientLocationStatistics) {
        this.totalNumberOfClients = totalNumberOfClients;
        this.topSpendingClients = topSpendingClients;
        this.clientActivity = clientActivity;
        this.clientLocationStatistics = clientLocationStatistics;
    }

    // Getters and setters
    public int getTotalNumberOfClients() {
        return totalNumberOfClients;
    }

    public void setTotalNumberOfClients(int totalNumberOfClients) {
        this.totalNumberOfClients = totalNumberOfClients;
    }

    public List<Client> getTopSpendingClients() {
        return topSpendingClients;
    }

    public void setTopSpendingClients(List<Client> topSpendingClients) {
        this.topSpendingClients = topSpendingClients;
    }

    public Map<String, Integer> getClientActivity() {
        return clientActivity;
    }

    public void setClientActivity(Map<String, Integer> clientActivity) {
        this.clientActivity = clientActivity;
    }

    public Map<String, Integer> getClientLocationStatistics() {
        return clientLocationStatistics;
    }

    public void setClientLocationStatistics(Map<String, Integer> clientLocationStatistics) {
        this.clientLocationStatistics = clientLocationStatistics;
    }
}

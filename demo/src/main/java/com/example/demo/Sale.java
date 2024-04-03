import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private int id;
    private Date creationDate;
    private Client client;
    private String seller;
    private double total;
    private List<SalesTransaction> transactions;

    // Constructor
    public Sale(int id, Date creationDate, Client client, String seller) {
        this.id = id;
        this.creationDate = creationDate;
        this.client = client;
        this.seller = seller;
        this.total = 0;
        this.transactions = new ArrayList<>();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<SalesTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<SalesTransaction> transactions) {
        this.transactions = transactions;
    }

    // Method to add a transaction to the sale
    public void addTransaction(SalesTransaction transaction) {
        transactions.add(transaction);
        updateTotal();
    }

    // Method to update total based on transactions
    private void updateTotal() {
        total = 0;
        for (SalesTransaction transaction : transactions) {
            total += transaction.getTotal();
        }
    }

    // toString method for debugging/logging
    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", client=" + client +
                ", seller='" + seller + '\'' +
                ", total=" + total +
                ", transactions=" + transactions +
                '}';
    }
}

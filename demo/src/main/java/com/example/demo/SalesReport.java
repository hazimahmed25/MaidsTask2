import java.util.Date;
import java.util.List;

public class SalesReport {
    private Date startDate;
    private Date endDate;
    private int totalNumberOfSales;
    private double totalRevenue;
    private List<Product> topSellingProducts;
    private List<String> topPerformingSellers;

    // Constructor
    public SalesReport(Date startDate, Date endDate, int totalNumberOfSales, double totalRevenue, List<Product> topSellingProducts, List<String> topPerformingSellers) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalNumberOfSales = totalNumberOfSales;
        this.totalRevenue = totalRevenue;
        this.topSellingProducts = topSellingProducts;
        this.topPerformingSellers = topPerformingSellers;
    }

    // Getters and setters
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getTotalNumberOfSales() {
        return totalNumberOfSales;
    }

    public void setTotalNumberOfSales(int totalNumberOfSales) {
        this.totalNumberOfSales = totalNumberOfSales;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public List<Product> getTopSellingProducts() {
        return topSellingProducts;
    }

    public void setTopSellingProducts(List<Product> topSellingProducts) {
        this.topSellingProducts = topSellingProducts;
    }

    public List<String> getTopPerformingSellers() {
        return topPerformingSellers;
    }

    public void setTopPerformingSellers(List<String> topPerformingSellers) {
        this.topPerformingSellers = topPerformingSellers;
    }
}

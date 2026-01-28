public class Products {
    private double basePrice;
    private String productName;

    public Products(double basePrice, String productName) {
        this.basePrice = basePrice;
        this.productName = productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double calculatePrice(int quantity) {
        return basePrice * quantity;
    }

    public double calculatePrice(int quantity, double discount) {
        double total = basePrice * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }

    public String toString() {
        return "Products[productName=" + productName + ", basePrice=" + basePrice + "]";
    }
}
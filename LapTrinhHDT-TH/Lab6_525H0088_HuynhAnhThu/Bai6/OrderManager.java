public class OrderManager {
    private Product[] inventory;

    public OrderManager(Product[] inventory) {
        this.inventory = inventory;
    }

    public Product findProduct(String name) {
        for (Product product : inventory) {
            if (product != null && product.name.equals(name)) {
                return product;
            }
        }
        return null;
    }

    public double processOrder(String[] orderNames, int[] quantities) {
        double totalCost = 0.0;
        boolean eligibleForPromo = false;
        double coffeePrice = 0.0;

        for (int i = 0; i < orderNames.length; i++) {
            Product product = findProduct(orderNames[i]);
            
            if (product != null && product.stock >= quantities[i]) {
                if (product.name.equals("Ham Sandwich")) {
                    eligibleForPromo = true;
                }
                if (product.name.equals("Vietnamese Iced Coffee")) {
                    coffeePrice = product.calculateFinalPrice();
                }
                
                product.sellItem(quantities[i]);
                totalCost += product.calculateFinalPrice() * quantities[i];
            }
        }

        if (eligibleForPromo && coffeePrice > 0) {
            totalCost -= coffeePrice;
        }

        return totalCost;
    }
}
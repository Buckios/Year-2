public class TestProducts {
    public static void main(String[] args) {
        // Create a product instance
        Products product1 = new Products(100.0, "Gaming Keyboard");

        // Test toString
        System.out.println(product1.toString());

        // Test Setters and Getters
        product1.setBasePrice(150.0);
        product1.setProductName("Mechanical Keyboard");
        System.out.println("Updated Name: " + product1.getProductName());
        System.out.println("Updated Price: " + product1.getBasePrice());

        // Test calculatePrice(quantity)
        int quantity = 2;
        System.out.println("Price for " + quantity + " items: " + product1.calculatePrice(quantity));

        // Test calculatePrice(quantity, discount)
        // Calculating for 2 items with a 10% discount
        double discount = 10.0;
        System.out.println("Price for " + quantity + " items with " + discount + "% discount: " + product1.calculatePrice(quantity, discount));
    }
}
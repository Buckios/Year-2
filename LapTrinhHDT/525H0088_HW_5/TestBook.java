public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Introduction to Java", "John Doe", 50.0);
        Book book2 = new Book("B002", "Advanced Algorithms", "Jane Smith", 80.0);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book1.setPrice(60.0);
        System.out.println("Book 1 new price: " + book1.getPrice());

        book1.applyDiscount(10.0);
        System.out.println("Book 1 price after 10% discount: " + book1.getPrice());

        System.out.println("Comparing prices (Higher price book info):");
        book1.comparePrice(book2);
    }
}
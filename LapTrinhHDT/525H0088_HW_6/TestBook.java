import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        for (int i = 0; i < 10; i++) {
            books[i] = new Book("Book Title " + (i + 1), 15.0 + i, 10 + i);
        }

        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int booksBought = 0;

        while (booksBought < 4) {
            System.out.println("Select a book index (0-9) to buy, or -1 to checkout:");
            int index = scanner.nextInt();

            if (index == -1) {
                break;
            }

            if (index >= 0 && index < 10) {
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();

                if (quantity > 0 && quantity <= books[index].getQty()) {
                    books[index].setQty(books[index].getQty() - quantity);
                    totalPrice += books[index].getPrice() * quantity;
                    booksBought++;
                    System.out.println("Added to cart.");
                } else {
                    System.out.println("Invalid quantity or not enough stock.");
                }
            } else {
                System.out.println("Invalid book index.");
            }
        }

        System.out.println("Total price of the order: " + totalPrice);
        scanner.close();
    }
}
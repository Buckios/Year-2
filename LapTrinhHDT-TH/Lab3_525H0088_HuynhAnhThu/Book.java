public class Book {
    private String bookID;
    private String title;
    private String author;
    private double price;

    public Book(String bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent < 100) {
            double discountAmount = price * (percent / 100);
            price -= discountAmount;
        }
    }

    public void comparePrice(Book other) {
        if (this.price > other.getPrice()) {
            System.out.println(this.toString());
        } else if (other.getPrice() > this.price) {
            System.out.println(other.toString());
        } else {
            System.out.println(this.toString());
        }
    }

    public String toString() {
        return "Book[bookID=" + bookID + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}
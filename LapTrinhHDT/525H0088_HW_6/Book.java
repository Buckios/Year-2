public class Book {
    private String title;
    private double price;
    private int qty;

    public Book() {
    }

    public Book(String t, double p, int q) {
        this.title = t;
        this.price = p;
        this.qty = q;
    }

    public Book(Book t) {
        if (t != null) {
            this.title = t.title;
            this.price = t.price;
            this.qty = t.qty;
        }
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setQty(int q) {
        this.qty = q;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + price + ", qty=" + qty + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Book book = (Book) obj;
        
        if (Double.compare(book.price, price) != 0) return false;
        if (qty != book.qty) return false;
        return title != null ? title.equals(book.title) : book.title == null;
    }

    public double getDiscount(int percent) {
        return price - (price * percent / 100.0);
    }
}
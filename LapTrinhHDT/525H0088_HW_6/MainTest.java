public class MainTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Alice Smith", 4000);
        emp.raiseSalary(15);
        System.out.println(emp.toString());
        System.out.println("Employee Annual Salary: " + emp.getAnnualSalary());
        System.out.println();

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(6, 8);
        System.out.println(p2.toString());
        System.out.println("Distance from origin: " + p2.distance());
        System.out.println("Distance from p1: " + p2.distance(p1));
        System.out.println();

        MyTime time1 = new MyTime(23, 59, 59);
        System.out.println("Current Time: " + time1.toString());
        System.out.println("Next Second: " + time1.nextSecond().toString());
        System.out.println();

        Book book1 = new Book("Introduction to Go", 45.0, 20);
        System.out.println(book1.toString());
        System.out.println("Discounted price (10%): " + book1.getDiscount(10));
        System.out.println();

        Author author1 = new Author("John Doe", 1985);
        System.out.println(author1.toString());
        System.out.println("Author Age: " + author1.getAge());
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("E001", "John Doe", 2018, 1.2, 2);

        System.out.println("--- Employee Tests ---");
        System.out.println("Employee 1 Emulation Grade: " + emp1.considerEmulation());
        System.out.println("Employee 1 Total Salary: " + emp1.getSalary());
        System.out.println("Employee 2 Emulation Grade: " + emp2.considerEmulation());
        System.out.println("Employee 2 Total Salary: " + emp2.getSalary());

        Manager mgr1 = new Manager();
        Manager mgr2 = new Manager("M001", "Alice Smith", 2.0, "Director", 3.5);

        System.out.println("\n--- Manager Tests ---");
        System.out.println("Manager 1 Emulation Grade: " + mgr1.considerEmulation());
        System.out.println("Manager 1 Total Salary: " + mgr1.getSalary());
        System.out.println("Manager 2 Emulation Grade: " + mgr2.considerEmulation());
        System.out.println("Manager 2 Total Salary: " + mgr2.getSalary());
    }
}
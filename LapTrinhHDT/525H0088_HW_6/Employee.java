public class Employee {
    private int id;
    private String fullname;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String n, int s) {
        this.id = id;
        this.fullname = n;
        this.salary = s;
    }

    public Employee(Employee e) {
        if (e != null) {
            this.id = e.id;
            this.fullname = e.fullname;
            this.salary = e.salary;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return fullname;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        this.fullname = n;
    }

    public void setSalary(int s) {
        this.salary = s;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", fullname=" + fullname + ", salary=" + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Employee employee = (Employee) obj;
        
        if (id != employee.id) return false;
        if (salary != employee.salary) return false;
        return fullname != null ? fullname.equals(employee.fullname) : employee.fullname == null;
    }

    public void raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }
}
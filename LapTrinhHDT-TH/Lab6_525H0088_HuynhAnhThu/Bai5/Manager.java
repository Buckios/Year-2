public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    public Manager() {
        super();
        this.position = "head of the administrative office";
        this.salaryCoefficientPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(ID, fullName, 2024, coefficientsSalary, 0);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff, String position, String department, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition() {
        return BASIC_SALARY * salaryCoefficientPosition;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonusByPosition();
    }
}
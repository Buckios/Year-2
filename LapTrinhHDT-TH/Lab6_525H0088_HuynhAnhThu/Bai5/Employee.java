public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;
    protected final double BASIC_SALARY = 1150.0;

    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() {
        int yearsOfWork = 2024 - this.yearJoined;
        if (yearsOfWork >= 5) {
            return yearsOfWork * BASIC_SALARY / 100.0;
        }
        return 0.0;
    }

    public String considerEmulation() {
        if (numDaysOff <= 1) {
            return "A";
        } else if (numDaysOff <= 3) {
            return "B";
        } else {
            return "C";
        }
    }

    public double getSalary() {
        double emulationCoefficient = 0.0;
        String grade = considerEmulation();
        
        if (grade.equals("A")) {
            emulationCoefficient = 1.0;
        } else if (grade.equals("B")) {
            emulationCoefficient = 0.75;
        } else if (grade.equals("C")) {
            emulationCoefficient = 0.5;
        }

        return BASIC_SALARY + BASIC_SALARY * (coefficientsSalary + emulationCoefficient) + getSenioritySalary();
    }
}
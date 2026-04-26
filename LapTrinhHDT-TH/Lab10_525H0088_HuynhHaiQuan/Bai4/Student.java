public class Student extends User {
    private String studentId;
    private String className;
    private int yearOfStudy;

    public Student(String username, String password, String fullName, String dateOfBirth, String studentId, String className, int yearOfStudy) {
        super(username, password, UserRole.STUDENT, fullName, dateOfBirth);
        this.studentId = studentId;
        this.className = className;
        this.yearOfStudy = yearOfStudy;
    }

    public String getStudentId() { return studentId; }
    public String getClassName() { return className; }
    public int getYearOfStudy() { return yearOfStudy; }

    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setClassName(String className) { this.className = className; }
    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }

    @Override
    public String toString() {
        return super.toString() + "," + studentId + "," + className + "," + yearOfStudy;
    }
}
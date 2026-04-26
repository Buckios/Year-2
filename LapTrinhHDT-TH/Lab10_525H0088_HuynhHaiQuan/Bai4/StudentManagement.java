import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private FileProcessing db;
    private List<Student> students;

    public StudentManagement(String studentFile) {
        db = FileProcessing.getInstance();
        students = new ArrayList<>();
        loadStudents(studentFile);
    }

    private void loadStudents(String studentFile) {
        List<String> lines = db.readFromFile(studentFile);
        for (String line : lines) {
            String[] p = line.split(",");
            if (p.length >= 8) {
                students.add(new Student(p[0], p[1], p[3], p[4], p[5], p[6], Integer.parseInt(p[7])));
            }
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        db.writeToFile(db.getStudentFile(), student.toString(), true);
    }

    public void deleteStudent(String studentId) {
        students.removeIf(s -> s.getStudentId().equals(studentId));
        rewriteStudentsFile();
    }

    public void rewriteStudentsFile() {
        try { new PrintWriter(db.getStudentFile()).close(); } catch (Exception e) {}
        for (Student s : students) {
            db.writeToFile(db.getStudentFile(), s.toString(), true);
        }
    }

    public Student findStudentById(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) return s;
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public List<Student> getStudentsByClass(String className) {
        List<Student> res = new ArrayList<>();
        for (Student s : students) {
            if (s.getClassName().equals(className)) res.add(s);
        }
        return res;
    }

    public List<Student> getStudentsByYear(int year) {
        List<Student> res = new ArrayList<>();
        for (Student s : students) {
            if (s.getYearOfStudy() == year) res.add(s);
        }
        return res;
    }

    public void exportToFile(String filename, List<Student> studentList, ExportType type) {
        Export exporter = ExportFactory.getExportType(type);
        if (exporter != null) {
            List<User> listAsUsers = new ArrayList<>(studentList);
            exporter.export(filename, listAsUsers);
        }
    }
}
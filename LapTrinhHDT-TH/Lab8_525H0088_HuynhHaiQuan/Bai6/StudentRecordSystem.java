import java.util.ArrayList;
import java.util.HashMap;

public class StudentRecordSystem {
    public static void main(String[] args) {
        ArrayList<Student<?>> studentList = new ArrayList<>();

        Student<Integer> itStudent = new Student<>("Alice", 52400001);
        itStudent.addGrade("Java", 8.5);
        itStudent.addGrade("Database", 9.0);

        Student<String> mathStudent = new Student<>("Bob", "C2400001");
        mathStudent.addGrade("Algebra", 9.5);
        mathStudent.addGrade("Calculus", 8.8);

        studentList.add(itStudent);
        studentList.add(mathStudent);

        for (Student<?> student : studentList) {
            System.out.println("Grades for " + student.getName() + " (ID: " + student.getStudentId() + "):");
            
            HashMap<String, Double> grades = student.getGrades();
            for (String subject : grades.keySet()) {
                Double grade = grades.get(subject);
                System.out.println(" - " + subject + ": " + grade);
            }
        }
    }
}
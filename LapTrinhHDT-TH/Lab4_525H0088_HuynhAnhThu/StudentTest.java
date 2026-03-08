public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Minh", "Huynh");
        
        System.out.println(student1.toString());
        System.out.println(student1.getName());
        
        student1.setID(102);
        student1.setFirstName("Khang");
        student1.setLastName("Tran");
        
        System.out.println(student1.getID());
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getName());
        System.out.println(student1.toString());
    }
}
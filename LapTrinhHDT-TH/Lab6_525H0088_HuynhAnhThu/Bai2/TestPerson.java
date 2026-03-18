public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("John Doe", "123 Main St");
        System.out.println(p1.toString());
        
        p1.setAddress("456 Oak Ave");
        System.out.println(p1.toString());

        System.out.println("---");

        Student s1 = new Student("Alice Smith", "789 Pine Rd", "Computer Science", 2023, 1500.50);
        System.out.println(s1.toString());
        
        System.out.println(s1.getName());
        System.out.println(s1.getProgram());
        
        s1.setYear(2024);
        s1.setFee(1600.00);
        System.out.println(s1.toString());

        System.out.println("---");

        Staff st1 = new Staff("Bob Johnson", "321 Elm St", "Engineering", 55000.00);
        System.out.println(st1.toString());
        
        System.out.println(st1.getAddress());
        System.out.println(st1.getSchool());
        
        st1.setPay(60000.00);
        System.out.println(st1.toString());
    }
}
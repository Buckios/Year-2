public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Huynh Hai Quan", "123 Tran Xuan Soan St");
        System.out.println(p1.toString());
        
        p1.setAddress("456 Xo Viet Nghe Tinh");
        System.out.println("New Address: " + p1.toString());

        System.out.println("--------------");

        Student s1 = new Student("Nguyen Minh Trung", "789 Binh Duc", "Computer Science", 2023, 1500.50);
        System.out.println(s1.toString());
        
        System.out.println("Name: " + s1.getName());
        System.out.println("Program: " + s1.getProgram());
        
        s1.setYear(2024);
        s1.setFee(1600.00);
        System.out.println("New Year and Fee: " + s1.toString());

        System.out.println("---------------");

        Staff st1 = new Staff("Tran Minh Thuan", "321 Thu Duc", "USH", 55000.00);
        System.out.println(st1.toString());
        
        System.out.println("Address: " + st1.getAddress());
        System.out.println("School: " + st1.getSchool());
        
        st1.setPay(60000.00);
        System.out.println("New Pay: " + st1.toString());
    }
}
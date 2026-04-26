import java.util.Scanner;

public class ConsoleUI {
    private UserManagement userManager;
    private StudentManagement studentManager;
    private Scanner scanner;

    public ConsoleUI(String userFile, String studentFile) {
        userManager = new UserManagement(userFile);
        studentManager = new StudentManagement(studentFile);
        scanner = new Scanner(System.in);
    }

    public void start() {
        if (userManager.getAllUsers().isEmpty()) {
            userManager.addUser(new User("admin", "admin123", UserRole.ADMIN, "Administrator", "1990-01-01"));
        }

        while (true) {
            System.out.println("Welcome to Student Management System");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (userManager.authenticate(username, password)) {
                System.out.println("Login successful!\n");
                User user = userManager.getUser(username);
                if (user.getRole() == UserRole.ADMIN) {
                    adminMenu();
                } else {
                    studentMenu(username);
                }
            } else {
                System.out.println("Invalid credentials!\n");
            }
        }
    }

    private void adminMenu() {
        while (true) {
            System.out.println("=== Admin Menu ===");
            System.out.println("1. Add User");
            System.out.println("2. Delete User");
            System.out.println("3. List All Users");
            System.out.println("4. Add Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Find Student by ID");
            System.out.println("7. Export Students by Class");
            System.out.println("8. Export Students by Year");
            System.out.println("0. Logout");
            System.out.print("Choice: ");
            
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {}

            switch (choice) {
                case 1:
                    System.out.print("Username: ");
                    String u = scanner.nextLine();
                    System.out.print("Password: ");
                    String p = scanner.nextLine();
                    System.out.print("Role (ADMIN/STUDENT): ");
                    UserRole r = UserRole.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print("Full Name: ");
                    String fn = scanner.nextLine();
                    System.out.print("Date of Birth (YYYY-MM-DD): ");
                    String dob = scanner.nextLine();
                    userManager.addUser(new User(u, p, r, fn, dob));
                    System.out.println("User added successfully!\n");
                    break;
                case 2:
                    System.out.print("Username to delete: ");
                    userManager.deleteUser(scanner.nextLine());
                    System.out.println("User deleted successfully!\n");
                    break;
                case 3:
                    for (User user : userManager.getAllUsers()) {
                        System.out.println(user);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Student ID: ");
                    String sid = scanner.nextLine();
                    System.out.print("Password: ");
                    String spw = scanner.nextLine();
                    System.out.print("Full Name: ");
                    String sfn = scanner.nextLine();
                    System.out.print("Date of Birth (YYYY-MM-DD): ");
                    String sdob = scanner.nextLine();
                    System.out.print("Class Name: ");
                    String scn = scanner.nextLine();
                    System.out.print("Year of Study: ");
                    int sy = Integer.parseInt(scanner.nextLine());
                    Student st = new Student(sid, spw, sfn, sdob, sid, scn, sy);
                    studentManager.addStudent(st);
                    userManager.addUser(new User(sid, spw, UserRole.STUDENT, sfn, sdob));
                    System.out.println("Student added successfully!\n");
                    break;
                case 5:
                    System.out.print("Student ID to delete: ");
                    String dsid = scanner.nextLine();
                    studentManager.deleteStudent(dsid);
                    userManager.deleteUser(dsid);
                    System.out.println("Student deleted successfully!\n");
                    break;
                case 6:
                    System.out.print("Enter Student ID: ");
                    Student found = studentManager.findStudentById(scanner.nextLine());
                    if (found != null) {
                        System.out.println(found + "\n");
                    } else {
                        System.out.println("Student not found.\n");
                    }
                    break;
                case 7:
                    System.out.print("Enter class name: ");
                    String cname = scanner.nextLine();
                    System.out.print("Enter output filename (without extension): ");
                    String cfile = scanner.nextLine();
                    System.out.print("Choose format (1: CSV, 2: TXT): ");
                    int cfmt = Integer.parseInt(scanner.nextLine());
                    studentManager.exportToFile(cfile, studentManager.getStudentsByClass(cname), cfmt == 1 ? ExportType.CSV : ExportType.TXT);
                    System.out.println("Export completed!\n");
                    break;
                case 8:
                    System.out.print("Enter year of study: ");
                    int yname = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter output filename (without extension): ");
                    String yfile = scanner.nextLine();
                    System.out.print("Choose format (1: CSV, 2: TXT): ");
                    int yfmt = Integer.parseInt(scanner.nextLine());
                    studentManager.exportToFile(yfile, studentManager.getStudentsByYear(yname), yfmt == 1 ? ExportType.CSV : ExportType.TXT);
                    System.out.println("Export completed!\n");
                    break;
                case 0:
                    System.out.println("Goodbye!\n");
                    return;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }

    private void studentMenu(String username) {
        while (true) {
            System.out.println("=== Student Menu ===");
            System.out.println("1. View My Information");
            System.out.println("0. Logout");
            System.out.print("Choice: ");
            
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {}

            if (choice == 1) {
                Student s = studentManager.findStudentById(username);
                if (s != null) {
                    System.out.println("=== Your Information ===");
                    System.out.println("Student ID: " + s.getStudentId());
                    System.out.println("Full Name: " + s.getFullName());
                    System.out.println("Date of Birth: " + s.getDateOfBirth());
                    System.out.println("Class: " + s.getClassName());
                    System.out.println("Year of Study: " + s.getYearOfStudy());
                    System.out.println("========================\n");
                } else {
                    System.out.println("Student details not found.\n");
                }
            } else if (choice == 0) {
                System.out.println("Goodbye!\n");
                return;
            } else {
                System.out.println("Invalid choice.\n");
            }
        }
    }
}
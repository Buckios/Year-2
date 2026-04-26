import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    private FileProcessing db;
    private List<User> users;

    public UserManagement(String userFile) {
        db = FileProcessing.getInstance();
        users = new ArrayList<>();
        loadUsers(userFile);
    }

    private void loadUsers(String userFile) {
        List<String> lines = db.readFromFile(userFile);
        for (String line : lines) {
            String[] p = line.split(",");
            if (p.length >= 5) {
                users.add(new User(p[0], p[1], UserRole.valueOf(p[2]), p[3], p[4]));
            }
        }
    }

    public boolean authenticate(String username, String password) {
        User u = getUser(username);
        return u != null && u.getPassword().equals(password);
    }

    public User getUser(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) return u;
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
        db.writeToFile(db.getUserFile(), user.toString(), true);
    }

    public void deleteUser(String username) {
        users.removeIf(u -> u.getUsername().equals(username));
        try { new PrintWriter(db.getUserFile()).close(); } catch (Exception e) {}
        for (User u : users) {
            db.writeToFile(db.getUserFile(), u.toString(), true);
        }
    }

    public List<User> getAllUsers() {
        return users;
    }
}
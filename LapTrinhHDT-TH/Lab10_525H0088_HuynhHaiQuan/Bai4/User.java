public class User {
    protected String username;
    protected String password;
    protected UserRole role;
    protected String fullName;
    protected String dateOfBirth;

    public User(String username, String password, UserRole role, String fullName, String dateOfBirth) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public UserRole getRole() { return role; }
    public String getFullName() { return fullName; }
    public String getDateOfBirth() { return dateOfBirth; }

    public void setPassword(String password) { this.password = password; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    @Override
    public String toString() {
        return username + "," + password + "," + role + "," + fullName + "," + dateOfBirth;
    }
}
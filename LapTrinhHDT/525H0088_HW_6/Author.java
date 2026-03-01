import java.time.Year;

public class Author {
    private String fullname;
    private int birthyear;

    public Author() {
    }

    public Author(String f, int y) {
        this.fullname = f;
        this.birthyear = y;
    }

    public Author(Author a) {
        if (a != null) {
            this.fullname = a.fullname;
            this.birthyear = a.birthyear;
        }
    }

    public String getFullname() {
        return fullname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setFullname(String t) {
        this.fullname = t;
    }

    public void setBirthyear(int q) {
        this.birthyear = q;
    }

    @Override
    public String toString() {
        return "Author[fullname=" + fullname + ", birthyear=" + birthyear + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Author author = (Author) obj;
        
        if (birthyear != author.birthyear) return false;
        return fullname != null ? fullname.equals(author.fullname) : author.fullname == null;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthyear;
    }
}
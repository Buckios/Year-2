import java.io.Serializable;

public class Character implements Serializable {
    public static final long serialVersionUID = 2025L;
    
    private String name;
    private int level;
    private int health;
    private int attackPower;
    private int defense;
    private transient double score;

    public Character(String name, int level, int health, int attackPower, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', level=" + level + ", health=" + health +
                ", attackPower=" + attackPower + ", defense=" + defense + ", score=" + score + "}";
    }
}
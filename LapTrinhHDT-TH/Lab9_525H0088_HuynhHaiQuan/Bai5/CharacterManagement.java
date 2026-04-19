import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CharacterManagement {

    public CharacterManagement() {
    }

    public void serializeCharacter(Character character, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(character);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Character deserializeCharacter(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Character) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Character action(Character character) {
        if ("Warrior".equals(character.getName())) {
            character.setScore(character.getScore() + 100.0);
        }
        return character;
    }
}
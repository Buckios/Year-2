import java.io.*;
import java.util.*;

public class FileProcessing {
    private static FileProcessing instance;

    private FileProcessing() {}

    public static FileProcessing getInstance() {
        if (instance == null) {
            instance = new FileProcessing();
        }
        return instance;
    }

    public void writeToFile(String filename, String content, boolean append) {
        try (FileWriter fw = new FileWriter(filename, append);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    public List<String> readFromFile(String filename) {
        List<String> lines = new ArrayList<>();
        File file = new File(filename);
        if (!file.exists()) return lines;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        return lines;
    }

    public String getUserFile() {
        return "users.txt";
    }

    public String getStudentFile() {
        return "students.txt";
    }
}
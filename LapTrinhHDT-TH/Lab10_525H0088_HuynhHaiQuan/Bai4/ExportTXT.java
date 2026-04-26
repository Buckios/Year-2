import java.io.PrintWriter;
import java.util.List;

public class ExportTXT implements Export {
    @Override
    public void export(String filename, List<User> studentList) {
        String file = filename + ".txt";
        try { new PrintWriter(file).close(); } catch (Exception e) {}
        for (User u : studentList) {
            FileProcessing.getInstance().writeToFile(file, u.toString(), true);
        }
    }
}
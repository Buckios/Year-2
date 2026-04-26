import java.io.PrintWriter;
import java.util.List;

public class ExportCSV implements Export {
    @Override
    public void export(String filename, List<User> studentList) {
        String file = filename + ".csv";
        try { new PrintWriter(file).close(); } catch (Exception e) {}
        FileProcessing.getInstance().writeToFile(file, "Username,Password,Role,FullName,DateOfBirth,StudentId,ClassName,YearOfStudy", true);
        for (User u : studentList) {
            FileProcessing.getInstance().writeToFile(file, u.toString(), true);
        }
    }
}
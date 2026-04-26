public class ExportFactory {
    public static Export getExportType(ExportType type) {
        if (type == ExportType.CSV) {
            return new ExportCSV();
        } else if (type == ExportType.TXT) {
            return new ExportTXT();
        }
        return null;
    }
}
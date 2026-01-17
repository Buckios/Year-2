public class CleanVietnamName {

    public static void main(String[] args) {
        String input = "   nGuyen   vAN    aN   ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Cleaned:  '" + cleanName(input) + "'");
    }

    public static String cleanName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            return "";
        }

        String[] parts = fullName.trim().split("\\s+");
        StringBuilder cleanedName = new StringBuilder();

        for (String part : parts) {
            if (part.length() > 0) {
                String capitalizedPart = part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
                cleanedName.append(capitalizedPart).append(" ");
            }
        }

        return cleanedName.toString().trim();
    }
}
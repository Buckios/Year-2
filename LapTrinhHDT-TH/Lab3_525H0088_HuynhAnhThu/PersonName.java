public class PersonName {

    public static void main(String[] args) {
        System.out.println(getFirstAndLastName("Nguyen Van Chien"));
        System.out.println(getMiddleName("Nguyen Thi Thu Thao"));
        System.out.println(capitalizeFullName("nguyen van chien"));
        System.out.println(formatVowelsConsonants("Nguyen Van Chien"));
    }

    public static String getFirstAndLastName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        if (parts.length < 2) return fullName;
        return parts[0] + " " + parts[parts.length - 1];
    }

    public static String getMiddleName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        StringBuilder middleName = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            middleName.append(parts[i]);
            if (i < parts.length - 2) {
                middleName.append(" ");
            }
        }
        return middleName.toString();
    }

    public static String capitalizeFullName(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String word = parts[i];
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            }
            if (i < parts.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String formatVowelsConsonants(String fullName) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";
        
        for (char c : fullName.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isLetter(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
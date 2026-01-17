import java.util.StringTokenizer;

public class CountTokens {

    public static void main(String[] args) {
        String sentence = "Java is a powerful language. Learning java is fun because JAVA is versatile.";
        String targetToken = "Java";

        int count = countTokenOccurrences(sentence, targetToken);
        System.out.println("The token '" + targetToken + "' appears " + count + " times.");
    }

    public static int countTokenOccurrences(String sentence, String target) {
        int count = 0;
        
        String targetLower = target.toLowerCase();

        StringTokenizer st = new StringTokenizer(sentence, " .,!?;:");

        while (st.hasMoreTokens()) {
            String currentToken = st.nextToken();

            if (currentToken.toLowerCase().equals(targetLower)) {
                count++;
            }
        }

        return count;
    }
}
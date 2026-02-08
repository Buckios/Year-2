import java.util.ArrayList;

public class WordCount {
    public static void main(String[] args) {
        String text = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
        String[] words = text.split("[^a-zA-Z]+");

        ArrayList<String> uniqueWords = new ArrayList<>();
        ArrayList<Integer> wordCounts = new ArrayList<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            boolean found = false;
            for (int i = 0; i < uniqueWords.size(); i++) {
                if (uniqueWords.get(i).equalsIgnoreCase(word)) {
                    wordCounts.set(i, wordCounts.get(i) + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords.add(word);
                wordCounts.add(1);
            }
        }

        Object[][] resultMap = new Object[uniqueWords.size()][2];
        for (int i = 0; i < uniqueWords.size(); i++) {
            resultMap[i][0] = uniqueWords.get(i);
            resultMap[i][1] = wordCounts.get(i);
            System.out.println("'" + resultMap[i][0] + "': " + resultMap[i][1] + ",");
        }
    }
}
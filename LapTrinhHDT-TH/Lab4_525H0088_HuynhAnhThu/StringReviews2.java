import java.util.Scanner;

public class StringReviews2 {

    public static int countWord(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }
        return paragraph.trim().split("\\s+").length;
    }

    public static int countSentences(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }
        return paragraph.split("[.!?]+").length;
    }

    public static int countAppear(String paragraph, String word) {
        if (paragraph == null || word == null || word.isEmpty()) {
            return 0;
        }
        String[] words = paragraph.split("\\W+");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        
        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine();

        System.out.println("Word count: " + countWord(paragraph));
        System.out.println("Sentence count: " + countSentences(paragraph));
        System.out.println("Occurrences of '" + searchWord + "': " + countAppear(paragraph, searchWord));

        scanner.close();
    }
}
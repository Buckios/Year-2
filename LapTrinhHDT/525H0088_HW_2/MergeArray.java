import java.util.Random;

public class MergeArray {

    public static void main(String[] args) {
        int N = 10000;
        char[] randomChars = new char[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            randomChars[i] = (char) (random.nextInt(26) + 'a');
        }

        long startTime = System.nanoTime();
        String str1 = "";
        for (char c : randomChars) {
            str1 += c;
        }
        long endTime = System.nanoTime();
        long durationConcat = endTime - startTime;

        System.out.println("Standard Concatenation: " + durationConcat + " ns");

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (char c : randomChars) {
            sb.append(c);
        }
        String str2 = sb.toString();
        endTime = System.nanoTime();
        long durationBuilder = endTime - startTime;

        System.out.println("StringBuilder: " + durationBuilder + " ns");
        
        System.out.println("Performance Ratio: StringBuilder is roughly " + (durationConcat / durationBuilder) + " times faster.");

        System.out.println("Explaination:");
        System.out.println("The StringBuilder is faster due to it mutability.");
        System.out.println("String is immutable: it creates 10,000 new objects in memory.");
        System.out.println("StringBuilder is mutable: it uses one buffer, saving time and memory.");

    }
}
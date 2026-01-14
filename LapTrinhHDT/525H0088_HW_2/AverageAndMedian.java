import java.util.Scanner;
import java.util.Arrays;
public class AverageAndMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " intergers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double avg = calcAvg(arr);
        double median = calcMedian(arr);

        System.out.println("Average: " + avg);
        System.out.println("Median: " + median);

        sc.close();
    }

    public static double calcAvg(int[] arr) {
        if (arr.length == 0) return 0;
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static double calcMedian(int[] arr) {
        if (arr.length == 0) return 0;
        Arrays.sort(arr);

        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
        } 
    } 
}
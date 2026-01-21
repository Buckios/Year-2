import java.util.Arrays;
import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.print("Enter k the divisor:");
        int k = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        int[] output = divisibleNumbers(a, k);
        System.out.print(Arrays.toString(output)); 

        sc.close();
    }

    public static int[] divisibleNumbers(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int resultIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                result[resultIndex] = arr[i];
                resultIndex++;
            }
        }
        return result;
    }
}
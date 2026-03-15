import java.util.Scanner;

public class ArrayReviews {

    static Scanner scanner = new Scanner(System.in);

    public static int maxEven(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            if (num % 2 == 0 && num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minOdd(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int num : a) {
            if (num % 2 != 0 && num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int sumMEMO(int[] a) {
        return maxEven(a) + minOdd(a);
    }

    public static int sumEven(int[] a) {
        int sum = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int prodOdd(int[] a) {
        int prod = 1;
        boolean hasOdd = false;
        for (int num : a) {
            if (num % 2 != 0) {
                prod *= num;
                hasOdd = true;
            }
        }
        return hasOdd ? prod : 0;
    }

    public static int idxFirstEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int idxLastOdd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        int[] arr = input(n);

        System.out.println("Greatest even: " + maxEven(arr));
        System.out.println("Smallest odd: " + minOdd(arr));
        System.out.println("Sum MEMO: " + sumMEMO(arr));
        System.out.println("Sum of evens: " + sumEven(arr));
        System.out.println("Product of odds: " + prodOdd(arr));
        System.out.println("Index of first even: " + idxFirstEven(arr));
        System.out.println("Index of last odd: " + idxLastOdd(arr));
    }
}
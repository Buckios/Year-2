import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] input = {-5, -4, 0, 3, 6, -9};
        
        int[] result = processArray(input);

        System.out.println("Original: " + Arrays.toString(input));
        System.out.println("Processed: " + Arrays.toString(result));
    }

    public static int[] processArray(int[] list) {
        int[] newArray = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int currentValue = list[i];

            currentValue = Math.abs(currentValue);

            if (currentValue % 2 == 0) {
                currentValue = currentValue * 2;
            }

            newArray[i] = currentValue;
        }

        return newArray;
    }
}
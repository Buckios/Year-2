import java.util.Arrays;
import java.util.Random;

public class DigitalImageBlur {

    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        int[][] image = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                image[i][j] = random.nextInt(256);
            }
        }

        System.out.println("Original Image:");
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }

        int[][] blurredImage = applyBlur(image);

        System.out.println("\nBlurred Image:");
        for (int[] row : blurredImage) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] applyBlur(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] newImage = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;

                for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
                    for (int colOffset = -1; colOffset <= 1; colOffset++) {
                        int neighborRow = i + rowOffset;
                        int neighborCol = j + colOffset;

                        if (neighborRow >= 0 && neighborRow < rows && neighborCol >= 0 && neighborCol < cols) {
                            sum += image[neighborRow][neighborCol];
                        }
                    }
                }
                
                newImage[i][j] = sum / 9;
            }
        }

        return newImage;
    }
}
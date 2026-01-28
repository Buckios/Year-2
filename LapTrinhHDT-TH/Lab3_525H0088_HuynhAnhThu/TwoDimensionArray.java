public class TwoDimensionArray {

    public static void main(String[] args) {
        //test data
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {1, 2, 3}
        };

        System.out.println("Matrix 1");
        printMatrix(matrix1);

        System.out.println("\nMatrix 2");
        printMatrix(matrix2);

        int[][] sumResult = addMatrices(matrix1, matrix2);
        System.out.println("\nSum of Matrix 1 + Matrix 2");
        printMatrix(sumResult);

        int scalar = 3;
        int[][] multiplyResult = multiplyMatrix(matrix1, scalar);
        System.out.println("\n--- Matrix 1 * " + scalar + " ---");
        printMatrix(multiplyResult);
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * k;
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
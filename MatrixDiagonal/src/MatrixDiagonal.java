import java.util.Arrays;

public class MatrixDiagonal {
    public static String getDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];

        for(int i = 0; i < matrix.length; i++) arr[i] = matrix[i][i];

        return Arrays.toString(arr);
    }

    public static String getCounterDiagonal(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int ml    = matrix.length - 1;

        for(int i = 0; i < matrix.length; i++) arr[i] = matrix[i][ml--];

        return Arrays.toString(arr);
    }
}
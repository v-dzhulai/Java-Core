public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(MatrixDiagonal.getDiagonal(arr));
        System.out.println(MatrixDiagonal.getCounterDiagonal(arr));
    }
}
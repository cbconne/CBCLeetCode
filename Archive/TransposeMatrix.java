import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(Arrays.deepToString(transposeMatrix.transpose(matrix)));
    }

    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}

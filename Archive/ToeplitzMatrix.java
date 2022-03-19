public class ToeplitzMatrix {
    public static void main(String[] args) {
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        int[][] matrix = { { 1, 2 }, { 2, 2 } };
        System.out.println(toeplitzMatrix.isToeplitzMatrix(matrix));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i > 0 && j > 0) {
                    if (matrix[i][j] != matrix[i - 1][j - 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

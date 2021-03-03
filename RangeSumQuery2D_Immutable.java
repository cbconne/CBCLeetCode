public class RangeSumQuery2D_Immutable {
    public static void main(String[] args) {
        int[][] matrix = { { -4, -5 } };
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(numMatrix.sumRegion(0, 0, 0, 1));
    }
}

class NumMatrix {

    int[][] matrix;
    int[][] sums;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        if (matrix.length == 0) {
            sums = null;
            return;
        }
        sums = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    sums[i][j] = matrix[i][j];
                } else if (i == 0) {
                    sums[i][j] = sums[i][j - 1] + matrix[i][j];
                } else if (j == 0) {
                    sums[i][j] = sums[i - 1][j] + matrix[i][j];
                } else {
                    sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 > 0 && col1 > 0) {
            return sums[row2][col2] - sums[row2][col1 - 1] - sums[row1 - 1][col2] + sums[row1 - 1][col1 - 1];
        } else if (row1 == row2 && col1 == col2) {
            return this.matrix[row1][col1];
        } else if (row1 == 0 && col1 == 0) {
            return sums[row2][col2];
        } else if (row1 == 0) {
            return sums[row2][col2] - sums[row2][col1 - 1];
        } else if (col1 == 0) {
            return sums[row2][col2] - sums[row1 - 1][col2];
        } else {
            return 0;
        }
    }
}
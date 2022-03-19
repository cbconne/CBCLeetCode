import java.util.Arrays;

/**
 * SpiralMatrixII
 */
public class SpiralMatrixII {

    public static void main(String[] args) {
        SpiralMatrixII spiralMatrixII = new SpiralMatrixII();
        int n = 4;
        System.out.println(Arrays.deepToString(spiralMatrixII.generateMatrix(n)));
    }

    public int[][] generateMatrix(int n) {
        int l = 1;
        int[][] res = new int[n][n];
        int rowUp = 0;
        int rowDown = n - 1;
        int columnLeft = 0;
        int columnRight = n - 1;
        while (rowDown >= rowUp && columnRight >= columnLeft) {
            for (int i = columnLeft; i <= columnRight; i++) {
                res[rowUp][i] = l;
                l++;
            }
            for (int i = rowUp + 1; i <= rowDown; i++) {
                res[i][columnRight] = l;
                l++;
            }
            if (rowDown != rowUp) {
                for (int i = columnRight - 1; i >= columnLeft; i--) {
                    res[rowDown][i] = l;
                    l++;
                }
            }
            if (columnLeft != columnRight) {
                for (int i = rowDown - 1; i >= rowUp + 1; i--) {
                    res[i][columnLeft] = l;
                    l++;
                }
            }
            rowUp++;
            rowDown--;
            columnLeft++;
            columnRight--;
        }
        return res;
    }
}
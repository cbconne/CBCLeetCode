import java.util.ArrayList;
import java.util.List;

/**
 * SpiralMatrix
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(spiralMatrix.spiralOrder(matrix));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rowUp = 0;
        int rowDown = matrix.length - 1;
        int columnLeft = 0;
        int columnRight = matrix[0].length - 1;
        while (rowDown >= rowUp && columnRight >= columnLeft) {
            for (int i = columnLeft; i <= columnRight; i++) {
                res.add(matrix[rowUp][i]);
            }
            for (int i = rowUp + 1; i <= rowDown; i++) {
                res.add(matrix[i][columnRight]);
            }
            if (rowDown != rowUp) {
                for (int i = columnRight - 1; i >= columnLeft; i--) {
                    res.add(matrix[rowDown][i]);
                }
            }
            if (columnLeft != columnRight) {
                for (int i = rowDown - 1; i >= rowUp + 1; i--) {
                    res.add(matrix[i][columnLeft]);
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
import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {
        int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        FlippinganImage flippinganImage = new FlippinganImage();
        System.out.println(Arrays.deepToString(flippinganImage.flipAndInvertImage(A)));
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int left = 0;
            int right = A[i].length - 1;
            while (left < right) {
                if (A[i][left] == A[i][right]) {
                    A[i][left] = 1 - A[i][left];
                    A[i][right] = 1 - A[i][right];
                }
                left++;
                right--;
            }
            if (left == right) {
                A[i][left] = 1 - A[i][left];
            }
        }
        return A;
    }
}

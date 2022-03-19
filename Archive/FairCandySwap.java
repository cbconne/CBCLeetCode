import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        FairCandySwap fairCandySwap = new FairCandySwap();
        int[] A = { 1, 1 };
        int[] B = { 2, 2 };
        System.out.println(Arrays.toString(fairCandySwap.fairCandySwap(A, B)));
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int sum_A = Arrays.stream(A).sum();
        int sum_B = Arrays.stream(B).sum();
        int difference = sum_A - sum_B;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] - B[j] == difference / 2) {
                return new int[] { A[i], B[j] };
            } else if (A[i] - B[j] < difference / 2) {
                i++;
            } else {
                j++;
            }
        }
        return null;
    }
}

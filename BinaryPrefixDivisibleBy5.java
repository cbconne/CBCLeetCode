import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public static void main(String[] args) {
        int[] A = { 1, 1, 1, 0, 1 };
        BinaryPrefixDivisibleBy5 binaryPrefixDivisibleBy5 = new BinaryPrefixDivisibleBy5();
        System.out.println(binaryPrefixDivisibleBy5.prefixesDivBy5(A));
    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int[] remainder = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                remainder[i] = A[i];
            } else {
                remainder[i] = ((remainder[i - 1] * 2) % 5 + A[i]) % 5;
            }
            res.add(remainder[i] == 0);
        }
        return res;
    }
}

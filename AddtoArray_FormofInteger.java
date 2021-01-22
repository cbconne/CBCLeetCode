import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArray_FormofInteger {
    public static void main(String[] args) {
        int[] A = {9,9,9,9,9};
        int K = 1;
        AddtoArray_FormofInteger addtoArray_FormofInteger = new AddtoArray_FormofInteger();
        System.out.println(addtoArray_FormofInteger.addToArrayForm(A, K));
    }

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        for (int i = A.length - 1; i >= 0; i--) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                sum -= 10;
                K++;
            }
            res.add(sum);
        }
        while (K > 0) {
            res.add(K % 10);
            K /= 10;
        }
        Collections.reverse(res);
        return res;
    }
}

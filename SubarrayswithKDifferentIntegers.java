import java.util.HashMap;
import java.util.Map;

public class SubarrayswithKDifferentIntegers {
    public static void main(String[] args) {
        SubarrayswithKDifferentIntegers subarrayswithKDifferentIntegers = new SubarrayswithKDifferentIntegers();
        int[] A = { 1, 2 };
        int K = 1;
        System.out.println(subarrayswithKDifferentIntegers.subarraysWithKDistinct(A, K));
    }

    public int subarraysWithKDistinct(int[] A, int K) {
        return subarraysMostKDistinct(A, K) - subarraysMostKDistinct(A, K - 1);
    }

    public int subarraysMostKDistinct(int[] A, int K) {
        if (K == 0) {
            return 0;
        }
        int left = 0, right = 0;
        int res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        while (true) {
            if (right < A.length && (count.keySet().contains(A[right]) || count.size() < K)) {
                if (count.keySet().contains(A[right])) {
                    count.replace(A[right], count.get(A[right]) + 1);
                } else {
                    count.put(A[right], 1);
                }
                right++;
            } else {
                res += right - left;
                if (count.get(A[left]) == 1) {
                    count.remove(A[left]);
                } else {
                    count.replace(A[left], count.get(A[left]) - 1);
                }
                left++;
            }
            if (left >= A.length) {
                break;
            }
        }
        return res;
    }
}

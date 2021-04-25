import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
//        int[] nums = {2, 4, 7, 8, 9, 12, 16, 20};
        int[] nums = {3, 5, 6, 9, 15, 48, 7, 2, 8};
        LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();
        System.out.println(largestDivisibleSubset.largestDivisibleSubset(nums));
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] dp = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i] = 1;
                continue;
            }
            int maxDp = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > maxDp) {
                    maxDp = dp[j] + 1;
                }
            }
            dp[i] = maxDp;
        }
        boolean flag = false;
        int lastNum = 0;
        int lastDp = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (dp[i] != Arrays.stream(dp).max().getAsInt() && !flag) {
                continue;
            } else if (!flag) {
                flag = true;
                lastNum = nums[i];
                lastDp = dp[i];
                res.add(nums[i]);
                continue;
            }
            if (lastNum % nums[i] == 0 && dp[i] == lastDp - 1) {
                lastNum = nums[i];
                lastDp = dp[i];
                res.add(nums[i]);
            }
        }
        return res;
    }
}

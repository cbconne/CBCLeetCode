import java.util.Arrays;

/**
 * @author CBC(U3666)
 * @date 2021/6/7 8:36
 */

public class TargetSum {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        TargetSum targetSum = new TargetSum();
        System.out.println(targetSum.findTargetSumWays(nums, target));
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        double negF = (sum - target) / 2.0;
        if (negF < 0 || Math.ceil(negF) != negF) {
            return 0;
        }
        int neg = (int) negF;
        int[][] dp = new int[nums.length + 1][neg + 1];
        for (int i = 0; i <= neg; i++) {
            if (i == 0) {
                dp[0][i] = 1;
            } else {
                dp[0][i] = 0;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= neg; j++) {
                if (nums[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                }
            }
        }
        return dp[nums.length][neg];
    }
}

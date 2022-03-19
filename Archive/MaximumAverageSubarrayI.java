import java.util.Arrays;

/**
 * MaximumAverageSubarrayI
 */
public class MaximumAverageSubarrayI {

    public static void main(String[] args) {
        MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();
        int[] nums = { 0, -1, -1, -3, -3 };
        int k = 4;
        System.out.println(maximumAverageSubarrayI.findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < 2) {
            return nums[0];
        } else if (k >= nums.length) {
            return 1.0 * Arrays.stream(nums).sum() / nums.length;
        }
        int l = 0;
        int r = l + k - 1;
        double sum = 0, res = -Double.MAX_VALUE;
        while (r < nums.length) {
            if (l == 0 || nums[r] - nums[l - 1] > 0) {
                for (int i = l; i < l + k; i++) {
                    sum += nums[i];
                }
                if (sum > res) {
                    res = sum;
                }
                sum = 0;
            }
            l++;
            r++;
        }
        return res / k;
    }
}
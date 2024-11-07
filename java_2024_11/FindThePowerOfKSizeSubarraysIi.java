import java.util.ArrayList;
import java.util.Arrays;

class FindThePowerOfKSizeSubarraysIi {
    public int[] resultsArray(int[] nums, int k) {
        // 左指针
        int left = 0;
        // 右指针
        int right = k - 1;
        // 不满足“连续、增长”的最后节点列表（左侧的下标表示）
        int invalid = -1;
        // 结果列表
        ArrayList<Integer> result = new ArrayList<>();
        // 遍历第一个子数组
        for (int i = 0; i < k - 1; i++) {
            if ((nums[i] >= nums[i + 1]) || (nums[i] + 1 != nums[i + 1])) {
                invalid = i;
            }
        }
        if (invalid == -1) {
            result.add(nums[right]);
        } else {
            result.add(-1);
        }
        // 遍历剩余的子数组
        while (right < nums.length - 1) {
            if ((nums[right] >= nums[right + 1]) || (nums[right] + 1 != nums[right + 1])) {
                invalid = right;
            }
            left++;
            right++;
            if (left <= invalid) {
                result.add(-1);
            } else {
                result.add(nums[right]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        FindThePowerOfKSizeSubarraysIi findThePowerOfKSizeSubarraysIi = new FindThePowerOfKSizeSubarraysIi();
        int[] nums = { 2 };
        int k = 1;
        int[] results = findThePowerOfKSizeSubarraysIi.resultsArray(nums, k);
        System.out.println(Arrays.toString(results));
    }
}
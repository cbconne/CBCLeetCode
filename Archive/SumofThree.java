import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumofThree {
    public static void main(String[] args) {
        int[] nums = { 0, -4, -1, -4, -2, -3, 2 };
        threeSum(nums);
        // System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (k > j) {
                if (nums[j] + nums[k] + nums[i] == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    do {
                        j++;
                    } while (nums[j] == nums[j - 1] && k > j);
                } else if (nums[j] + nums[k] + nums[i] < 0) {
                    do {
                        j++;
                    } while (nums[j] == nums[j - 1] && k > j);
                } else {
                    do {
                        k--;
                    } while (nums[k] == nums[k + 1] && k > j);
                }
            }
        }
        return ans;
    }

}
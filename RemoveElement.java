import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
//        int[] nums = {3, 2, 2, 3};
//        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] nums = {1};
        int val = 1;
        System.out.println(removeElement.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        int count = 0;
        while (l <= r) {
            while (l < nums.length && nums[l] != val) {
                l++;
            }
            while (r >= 0 && nums[r] == val) {
                r--;
                count++;
            }
            if (l < r) {
                nums[l] = nums[r];
                l++;
                r--;
                count++;
            }
        }
        return nums.length - count;
    }
}

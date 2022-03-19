import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII removeDuplicatesfromSortedArrayII = new RemoveDuplicatesfromSortedArrayII();
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicatesfromSortedArrayII.removeDulicates(nums));
        System.out.println(Arrays.toString(nums));

    }

    public int removeDulicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2, fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}

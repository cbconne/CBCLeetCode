import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] nums = { 1, 2, 3 };
        System.out.println(findPivotIndex.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0, rightsum = 0;
        sum = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            leftsum += i > 0 ? nums[i - 1] : 0;
            rightsum = sum - leftsum - nums[i];
            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }
}

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        MaximumProductofThreeNumbers maximumProductofThreeNumbers = new MaximumProductofThreeNumbers();
        int[] nums = { 1, -2, -3, 4, 5 };
        System.out.println(maximumProductofThreeNumbers.maximumProduct(nums));
    }

    public int maximumProduct(int[] nums) {
        int max_1 = Integer.MIN_VALUE;
        int max_2 = Integer.MIN_VALUE;
        int max_3 = Integer.MIN_VALUE;
        int min_1 = Integer.MAX_VALUE;
        int min_2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max_1) {
                max_3 = max_2;
                max_2 = max_1;
                max_1 = nums[i];
            } else if (nums[i] >= max_2) {
                max_3 = max_2;
                max_2 = nums[i];
            } else if (nums[i] >= max_3) {
                max_3 = nums[i];
            }
            if (nums[i] < min_1) {
                min_2 = min_1;
                min_1 = nums[i];
            } else if (nums[i] < min_2) {
                min_2 = nums[i];
            }
        }
        return Math.max(max_1 * max_2 * max_3, max_1 * min_1 * min_2);
    }
}

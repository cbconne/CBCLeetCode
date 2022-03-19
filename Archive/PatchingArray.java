public class PatchingArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 31, 33 };
        int n = 2147483647;
        System.out.println(minPatches(nums, n));
    }

    public static int minPatches(int[] nums, int n) {
        long x = 1;
        int i = 0;
        int t = 0;
        while (x <= n) {
            if (i < nums.length && nums[i] <= x) {
                x += nums[i];
                i++;
            } else {
                x *= 2;
                t++;
            }
        }
        return t;
    }
}

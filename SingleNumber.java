/**
 * @author CBC(U3666)
 * @date 2021/8/13 9:38
 */

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {1, 1, 2, 3, 2};
        System.out.println(singleNumber.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

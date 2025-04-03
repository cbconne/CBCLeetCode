class MaximumValueOfAnOrderedTripletIi {
    public long maximumTripletValue(int[] nums) {
        // 仅测试用例变长，阻拦暴力枚举方式，昨天的代码可以通过
        int minusMax = nums[0] - nums[1];
        int kMax = Math.max(nums[0], nums[1]);
        long result = Integer.MIN_VALUE;
        for (int k = 2; k < nums.length; k++) {
            long temp = (long) minusMax * nums[k];
            result = Math.max(result, temp);
            minusMax = Math.max(minusMax, kMax - nums[k]);
            kMax = Math.max(kMax, nums[k]);
        }
        if (result < 0) {
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
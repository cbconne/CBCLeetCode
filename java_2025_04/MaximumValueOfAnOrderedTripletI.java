class MaximumValueOfAnOrderedTripletI {
    public long maximumTripletValue(int[] nums) {
        int minusMax = nums[0] - nums[1];
        int kMax = Math.max(nums[0], nums[1]);
        long result = Integer.MIN_VALUE;
        for (int k = 2; k < nums.length; k++) {
            long temp = (long)minusMax * nums[k];
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
        MaximumValueOfAnOrderedTripletI maximumValueOfAnOrderedTripletI = new MaximumValueOfAnOrderedTripletI();
        int[] nums = { 12, 6, 1, 2, 7 };
        // System.out.println(maximumValueOfAnOrderedTripletI.maximumTripletValue(nums));
        nums = new int[] { 1, 10, 3, 4, 19 };
        // System.out.println(maximumValueOfAnOrderedTripletI.maximumTripletValue(nums));
        nums = new int[] { 1000000, 1, 1000000 };
        System.out.println(maximumValueOfAnOrderedTripletI.maximumTripletValue(nums));
    }
}
class CountSubarraysWithScoreLessThanK {
    public long countSubarrays(int[] nums, long k) {
        // 计算前缀和数组
        long[] sum = new long[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }

        long res = 0;
        // 滑窗
        int left = 0;
        int right = 0;
        while (right < nums.length && left <= right) {
            // 计算 score
            long score = (sum[right + 1] - sum[left]) * (right - left + 1);
            if (score < k) {
                // 满足需求，该滑窗内的子串均满足条件
                res += right - left + 1;
                right++;
            } else {
                // 不满足需求，计算当前左边界开始的不满足条件的子串数量，并更新左边界
                left++;
                if (left > right) {
                    right++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        CountSubarraysWithScoreLessThanK countSubarraysWithScoreLessThanK = new CountSubarraysWithScoreLessThanK();
        // System.out.println(countSubarraysWithScoreLessThanK.countSubarrays(new int[] { 2, 1, 4, 3, 5 }, 10));
        // System.out.println(countSubarraysWithScoreLessThanK.countSubarrays(new int[] { 1, 1, 1 }, 5));
        System.out.println(countSubarraysWithScoreLessThanK
                .countSubarrays(new int[] { 9, 5, 3, 8, 4, 7, 2, 7, 4, 5, 4, 9, 1, 4, 8, 10, 8, 10, 4, 7 }, 4));
    }
}
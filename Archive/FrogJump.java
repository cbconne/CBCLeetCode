public class FrogJump {
    public static void main(String[] args) {
        FrogJump frogJump = new FrogJump();
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        System.out.println(frogJump.canCross(stones));
    }

    public boolean canCross(int[] stones) {
        boolean[][] dp = new boolean[stones.length][stones.length + 1];
        dp[0][0] = true;
        for (int i = 0; i < stones.length - 1; i++) {
            if (stones[i + 1] - stones[i] > i + 1) {
                return false;
            }
        }
        for (int i = 1; i < stones.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int k = stones[i] - stones[j];
                if (k > i) {
                    continue;
                }
                dp[i][k] = dp[j][k - 1] || dp[j][k] || dp[j][k + 1];
                if (i == stones.length - 1 && dp[i][k]) {
                    return true;
                }
            }
        }
        return false;
    }
}

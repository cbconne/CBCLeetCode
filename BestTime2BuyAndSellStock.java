/**
 * @author CBC(U3666)
 * @date 2021/8/11 12:38
 */

public class BestTime2BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        BestTime2BuyAndSellStock bestTime2BuyAndSellStock = new BestTime2BuyAndSellStock();
        System.out.println(bestTime2BuyAndSellStock.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length + 1][2];
        dp[0][0] = 0;
        dp[0][1] = -Integer.MAX_VALUE;
        for (int i = 1; i <= prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i - 1]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i - 1]);
        }
        return dp[prices.length][0];
    }
}

import java.util.Arrays;

/**
 * BestTimetoBuyandSellStockIV
 */
public class BestTimetoBuyandSellStockIV {

    public static void main(String[] args) {
        int k = 2;
        int[] prices = { 2, 4, 1 };
        System.out.println(maxProfit(k, prices));
    }

    public static int maxProfit(int k, int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        k = Math.min(k, prices.length / 2);// n天最多进行n/2笔交易
        int[][] buy = new int[prices.length][k + 1];// buy[i][j]表示第i+1天进行了第j笔交易且手上有股票状态下的最大利润
        int[][] sell = new int[prices.length][k + 1];// sell[i][j]表示第i+1天进行了第j笔交易且手上无股票状态下的最大利润
        for (int i = 0; i < sell.length; i++) {
            sell[i][0] = buy[i][0] = 0;
        }

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0) {
                    sell[i][j] = 0;
                    if (i == j) {
                        buy[i][j] = -prices[0];
                        continue;
                    }
                } else if (j > (i + 1) / 2) {
                    sell[i][j] = buy[i][j] = -999;
                    continue;
                }
                buy[i][j] = Math.max(buy[i - 1][j], sell[i - 1][j] - prices[i]);
                if (j != 0) {
                    sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j - 1] + prices[i]);

                }
            }
        }
        return Arrays.stream(sell[prices.length - 1]).max().getAsInt();
    }
}
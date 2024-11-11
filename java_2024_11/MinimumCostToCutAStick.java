import java.util.Arrays;

class MinimumCostToCutAStick {

    public int minCost(int n, int[] cuts) {
        int[] newCuts = new int[cuts.length + 2];
        newCuts[0] = 0;
        newCuts[newCuts.length - 1] = n;
        for (int i = 1; i < newCuts.length - 1; i++) {
            newCuts[i] = cuts[i - 1];
        }
        Arrays.sort(newCuts);
        int[][] memo = new int[newCuts.length][newCuts.length];
        return dfs(0, newCuts.length - 1, newCuts, memo);

    }

    private int dfs(int start, int end, int[] cuts, int[][] memo) {
        if (memo[start][end] != 0) {
            return memo[start][end];
        }

        if (start + 1 == end) {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;
        for (int k = start + 1; k < end; k++) {
            int res = dfs(start, k, cuts, memo) + dfs(k, end, cuts, memo);
            if (minCost > res) {
                minCost = res;
            }
        }

        memo[start][end] = minCost + cuts[end] - cuts[start];
        return memo[start][end];

    }

    public static void main(String[] args) {
        MinimumCostToCutAStick minimumCostToCutAStick = new MinimumCostToCutAStick();
        int[] cuts = { 1, 3, 4, 5 };
        System.out.println(minimumCostToCutAStick.minCost(7, cuts));
        cuts = new int[] { 5, 6, 1, 4, 2 };
        System.out.println(minimumCostToCutAStick.minCost(9, cuts));
    }
}
public class GetEqualSubstringsWithinBudget {
    public static void main(String[] args) {
        GetEqualSubstringsWithinBudget getEqualSubstringsWithinBudget = new GetEqualSubstringsWithinBudget();
        String s = "abcd";
        String t = "bdfg";
        int maxCost = 0;
        System.out.println(getEqualSubstringsWithinBudget.equalSubstring(s, t, maxCost));
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int[] cost = new int[s.length()];
        for (int i = 0; i < cost.length; i++) {
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        int l = 0, r = 0;
        int sumCost = cost[0];
        int maxLength = 0;
        while (true) {
            if (sumCost <= maxCost) {
                maxLength = Math.max(maxLength, r - l + 1);
                r++;
                if (r >= cost.length) {
                    break;
                }
                sumCost += cost[r];
            } else {
                sumCost -= cost[l];
                l++;
            }
        }
        return maxLength;
    }
}

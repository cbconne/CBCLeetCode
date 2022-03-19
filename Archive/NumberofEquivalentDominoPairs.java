public class NumberofEquivalentDominoPairs {
    public static void main(String[] args) {
        NumberofEquivalentDominoPairs numberofEquivalentDominoPairs = new NumberofEquivalentDominoPairs();
        int[][] dominoes = { { 1, 2 }, { 2, 1 }, { 1, 2 }, { 3, 4 } };
        System.out.println(numberofEquivalentDominoPairs.numEquivDominoPairs(dominoes));
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int[] nums = new int[100];
        int res = 0;
        for (int[] i : dominoes) {
            int value = (i[0] < i[1]) ? i[0] * 10 + i[1] : i[1] * 10 + i[0];
            res += nums[value];
            nums[value]++;
        }
        return res;
    }
}

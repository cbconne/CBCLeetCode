class LexicographicallySmallestStringAfterASwap {
    public String getSmallestString(String s) {
        // 根据题意，易知，从左至右遍历字符串，若可交换且满足提议，则交换后直接返回即为答案
        // 因为：1. 从左至右遍历时，越左侧的交换对字典序的影响越大，即：同样一次交换，不管交换内容，一定是越左侧的交换后的字典序更小
        // 2. 题目只允许一次交换
        for (int i = 0; i < s.length() - 1; ++i) {
            if ((s.charAt(i) > s.charAt(i + 1)) && (s.charAt(i) % 2 == s.charAt(i + 1) % 2)) {
                // 交换
                char temp = s.charAt(i);
                s = s.substring(0, i) + s.charAt(i + 1) + s.substring(i + 2);
                return s.substring(0, i + 1) + temp + s.substring(i + 1);
            }
        }
        // 若不存在满足提议的交换，则直接返回原字符串即可
        return s;
    }

    public static void main(String[] args) {
        LexicographicallySmallestStringAfterASwap solution = new LexicographicallySmallestStringAfterASwap();
        System.out.println(solution.getSmallestString("10"));
    }
}
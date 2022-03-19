public class IntegerBreak {
    public static void main(String[] args) {
        System.out.println(integer_break(10));
    }

    public static Integer integer_break(int a) {
        int[] max = new int[a + 1];
        for (int i = 2; i <= a; i++) {
            for (int j = 1; j < i; j++) {
                int curmax = 0;
                curmax = Math.max(j * (i - j), j * max[i - j]);
                if (curmax > max[i]) {
                    max[i] = curmax;
                }
            }
        }
        return max[a];
    }
}
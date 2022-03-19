import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int num = 5;
        System.out.println(Arrays.toString(countingBits.countBits(num)));
    }

    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for (int i = 0; i < num + 1; i++) {
            if (i == 0) {
                res[i] = 0;
            } else {
                res[i] = res[i & (i - 1)] + 1;
            }
        }
        return res;
    }
}

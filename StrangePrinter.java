import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author CBC(U3666)
 * @date 2021/5/24 9:23
 */

public class StrangePrinter {
    public static void main(String[] args) {
        String s = "abaad";
        StrangePrinter strangePrinter = new StrangePrinter();
        System.out.println(strangePrinter.strangePrinter(s));
    }

    public int strangePrinter(String s) {
        int[][] f = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            f[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    f[i][j] = f[i][j - 1];
                } else {
                    f[i][j] = minK(f, i, j);
                }
            }
        }
        return f[0][s.length() - 1];
    }

    public int minK(int[][] f, int i, int j) {
        List<Integer> res = new ArrayList<>();
        for (int k = i; k < j; k++) {
            res.add(f[i][k] + f[k + 1][j]);
        }
        return Collections.min(res);
    }
}

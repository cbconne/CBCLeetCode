import java.util.Arrays;

/**
 * assignCookies
 */
public class assignCookies {

    public static void main(String[] args) {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };
        int result = findContentChildren(g, s);
        System.out.println(result);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (g[j] <= s[i]) {
                j++;
                if (j == g.length) {
                    break;
                }
            }
        }
        return j;
    }
}
import java.util.ArrayList;
import java.util.List;

public class PositionsofLargeGroups {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(largeGroupPositions(s));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        int l = 1;
        for (int i = 0; i <= s.length(); i++) {
            if (i == 0 || i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                if (l >= 3) {
                    r.add(i - 1);
                    res.add(new ArrayList<>(r));
                }
                r.clear();
                l = 1;
                r.add(i);
            } else if (s.charAt(i) == s.charAt(i - 1)) {
                l++;
            }
        }
        return res;
    }
}

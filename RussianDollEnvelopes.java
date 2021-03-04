import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RussianDollEnvelopes {
    public static void main(String[] args) {
        // int[][] envelopes = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
        int[][] envelopes = { { 1, 3 }, { 3, 5 }, { 6, 7 }, { 6, 8 }, { 8, 4 }, { 9, 5 } };
        RussianDollEnvelopes russianDollEnvelopes = new RussianDollEnvelopes();
        System.out.println(russianDollEnvelopes.maxEnvelopes(envelopes));
    }

    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes.length == 0) {
            return 0;
        }
        List<Integer> f = new ArrayList<>();
        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] envelope1, int[] envelope2) {
                if (envelope1[0] != envelope2[0]) {
                    return envelope1[0] - envelope2[0];
                } else {
                    return envelope2[1] - envelope1[1];
                }
            }
        });
        f.add(envelopes[0][1]);
        for (int i = 1; i < envelopes.length; i++) {
            if (envelopes[i][1] > f.get(f.size() - 1)) {
                f.add(envelopes[i][1]);
            } else {
                int num = findMaxLess(f, envelopes[i][1]);
                f.set(num, envelopes[i][1]);
            }
        }
        return f.size();
    }

    public int findMaxLess(List<Integer> f, int length) {
        int l = 0, r = f.size() - 1;
        int mid = (l + r) / 2;
        while (l < r) {
            if (f.get(mid) >= length) {
                r = mid;
            } else if (f.get(mid) < length) {
                l = mid + 1;
            } else {
                return mid;
            }
            mid = (l + r) / 2;
        }
        return l;
    }
}

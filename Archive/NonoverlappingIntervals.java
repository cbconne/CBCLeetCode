import java.util.Arrays;
import java.util.Comparator;

public class NonoverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 2, 3 } };
        System.out.println(eraseOverlapIntervals(intervals));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[1] - interval2[1];
            }
        });
        int right = intervals[0][1];
        int noans = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= right) {
                noans++;
                right = intervals[i][1];
            }
        }
        return intervals.length - noans;
    }
}

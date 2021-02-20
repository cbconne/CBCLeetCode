import java.util.HashMap;
import java.util.Map;

/**
 * DegreeofanArray
 */
public class DegreeofanArray {

    public static void main(String[] args) {
        DegreeofanArray degreeofanArray = new DegreeofanArray();
        int[] nums = { 1, 2, 2, 3, 1 };
        System.out.println(degreeofanArray.findShortestSubArray(nums));
    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int[] temp = { 1, i, i };
                map.put(nums[i], temp);
            } else {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }
        }
        int max = 0;
        int minLength = nums.length;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            if (entry.getValue()[0] > max
                    || (entry.getValue()[0] == max && entry.getValue()[2] - entry.getValue()[1] + 1 < minLength)) {
                max = entry.getValue()[0];
                minLength = entry.getValue()[2] - entry.getValue()[1] + 1;
            }
        }
        return minLength;
    }
}
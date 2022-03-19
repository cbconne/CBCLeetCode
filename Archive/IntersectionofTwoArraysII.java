import java.util.*;

/**
 * @author CBC(U3666)
 * @date 2021/8/13 9:50
 */

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        IntersectionofTwoArraysII intersectionofTwoArraysII = new IntersectionofTwoArraysII();
        System.out.println(Arrays.toString(intersectionofTwoArraysII.intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return intersect(nums2, nums1);
        }
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i : nums1) {
            Integer cnt = map.getOrDefault(i, 0);
            map.put(i, cnt + 1);
        }
        for (int i : nums2) {
            Integer cnt = map.getOrDefault(i, 0);
            if (cnt != 0) {
                res.add(i);
                map.put(i, cnt - 1);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}

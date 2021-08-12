import java.util.HashSet;
import java.util.Set;

/**
 * @author CBC(U3666)
 * @date 2021/8/12 12:26
 */

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int num : nums) {
            if (!integers.add(num)) {
                return true;
            }
        }
        return false;
    }
}

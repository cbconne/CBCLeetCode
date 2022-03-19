import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        //List<Integer> list=find_DisappearedNumbers({1,1});
    }

    public static List<Integer> find_DisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n];
        for (int i = 0; i < n; ++i) {
            hash[nums[i] - 1] = 1;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (hash[i] != 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
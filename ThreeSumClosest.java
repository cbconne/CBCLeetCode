import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 9, 14, 16, 70 };
        System.out.println(three_sum_closest(nums, 81));
    }

    public static int three_sum_closest(int[] nums, int target) {
        int[] copy = nums.clone();
        int[] temp = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
        int[] sum = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
        Arrays.sort(copy);
        for (int i = 0; i < nums.length - 2; i++) {
            int p = i + 1;
            int q = nums.length - 1;
            sum[1] = copy[i] + copy[p] + copy[q];
            temp[1] = Math.abs(target - sum[1]);
            while (true) {
                if (sum[1] > target) {
                    if (q > p + 1) {
                        q--;
                        sum[0] = copy[i] + copy[p] + copy[q];
                        temp[0] = Math.abs(target - sum[0]);
                    } else {
                        if (temp[1] < temp[2]) {
                            temp[2] = temp[1];
                            sum[2] = sum[1];
                        }
                        break;
                    }
                    if (temp[0] > temp[1] && temp[2] > temp[1]) {
                        temp[2] = temp[1];
                        sum[2] = sum[1];
                        break;
                    } else {
                        temp[1] = temp[0];
                        sum[1] = sum[0];
                    }
                } else if (sum[1] < target) {
                    if (p < q - 1) {
                        p++;
                        sum[0] = copy[i] + copy[p] + copy[q];
                        temp[0] = Math.abs(target - sum[0]);
                    } else {
                        if (temp[1] < temp[2]) {
                            temp[2] = temp[1];
                            sum[2] = sum[1];
                        }
                        break;
                    }
                    if (temp[0] > temp[1] && temp[2] > temp[1]) {
                        temp[2] = temp[1];
                        sum[2] = sum[1];
                        break;
                    } else {
                        temp[1] = temp[0];
                        sum[1] = sum[0];
                    }
                } else {
                    return target;
                }
            }
        }
        return sum[2];
    }
}
public class LongestTurbulentSubarray {
    public static void main(String[] args) {
        LongestTurbulentSubarray longestTurbulentSubarray = new LongestTurbulentSubarray();
        // int[] arr = { 9, 9, 9, 9, 9 };
        // int[] arr = { 9, 4, 2, 10, 7, 8, 8, 1, 9 };
        int[] arr = { 4, 4, 8, 12, 16 };
        System.out.println(longestTurbulentSubarray.maxTurbulenceSize(arr));
    }

    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }
        int left = 0, right = 0;
        int res = 1;
        while (true) {
            if (left == right && right < arr.length - 1) {
                right++;
                if (arr[left] == arr[right]) {
                    left++;
                }
            } else if (right < arr.length - 1) {
                if ((arr[right] > arr[right - 1] && arr[right] > arr[right + 1])
                        || arr[right] < arr[right - 1] && arr[right] < arr[right + 1]) {
                    right++;
                } else {
                    left = right;
                }
            } else {
                break;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}

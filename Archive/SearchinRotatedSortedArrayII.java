public class SearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        SearchinRotatedSortedArrayII searchinRotatedSortedArrayII =
                new SearchinRotatedSortedArrayII();
//        int[] nums = {2, 5, 6, 0, 0, 1, 2};
//        int[] nums = {2, 2, 2, 0, 2, 2};
//        int[] nums = {3, 1};
//        int[] nums = {1, 0, 1, 1, 1};
        int[] nums = {2, 2, 2, 0, 0, 1};
        int target = 0;
        System.out.println(searchinRotatedSortedArrayII.search(nums, target));
    }

    public boolean search(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }
        int l = 0, r = nums.length - 1;
        int mid;
        while (r >= l) {
            if (r == l + 1) {
                return nums[l] == target || nums[r] == target;
            }
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if ((nums[l] == nums[mid]) && (nums[r] == nums[mid])) {
                l++;
                r--;
                continue;
            }
            if (nums[l] <= nums[mid]) {// l->mid部分有序
                if (target >= nums[l] && target <= nums[mid]) {// target在该有序部分中
                    r = mid;
                } else {// target不在该有序部分中
                    l = mid + 1;
                }
            } else {// mid->r部分有序
                if (target >= nums[mid] && target <= nums[r]) {// target在该有序部分中
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
        }
        return false;
    }
}
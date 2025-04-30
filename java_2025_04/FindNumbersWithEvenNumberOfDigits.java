class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String numString = String.valueOf(nums[i]);
            if (numString.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbersWithEvenNumberOfDigits.findNumbers(nums));
        int[] nums2 = { 555, 901, 482, 1771 };
        System.out.println(findNumbersWithEvenNumberOfDigits.findNumbers(nums2));
    }
}
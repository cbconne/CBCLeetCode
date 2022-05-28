package study2022_5

func RepeatedNTimes(nums []int) int {
	for i, num := range nums {
		if (i+1 < len(nums) && nums[i+1] == num) ||
			(i+2 < len(nums) && nums[i+2] == num) ||
			(i+3 < len(nums) && nums[i+3] == num) {
			return num
		}
	}
	return 0
}

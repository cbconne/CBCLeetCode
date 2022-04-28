package study2022_4

func SortArrayByParity(nums []int) []int {
	l := 0
	r := len(nums) - 1
	for l < r {
		if nums[l]%2 == 0 {
			l++
			continue
		} else if nums[r]%2 == 1 {
			r--
			continue
		} else {
			nums[l], nums[r] = nums[r], nums[l]
		}
	}
	return nums
}

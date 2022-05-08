package study2022_5

func FindDuplicates(nums []int) []int {
	for i := range nums {
		for nums[nums[i]-1] != nums[i] {
			nums[i], nums[nums[i]-1] = nums[nums[i]-1], nums[i]
		}
	}
	res := []int{}
	for i := range nums {
		if nums[i]-1 != i {
			res = append(res, nums[i])
		}
	}
	return res
}

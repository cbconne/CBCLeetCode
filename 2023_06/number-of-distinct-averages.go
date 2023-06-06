package study2023_06

import "sort"

func distinctAverages(nums []int) int {
	// sort
	sort.Ints(nums)
	// left & right
	left := 0
	right := len(nums) - 1

	m := make(map[float32]int, 0)

	for left < right {
		avg := float32(nums[left]+nums[right]) / 2
		m[avg] = 1
		left++
		right--
	}

	return len(m)
}

func DistinctAveragesTest() {
	//	输入：nums = [4,1,4,0,3,5]
	//	输出：2
	nums := []int{4, 1, 4, 0, 3, 5}
	println(distinctAverages(nums))
}

package go_2025_04

import "sort"

func minOperations(nums []int, k int) int {
	// 获取数组中最小值
	sort.Ints(nums)
	min := nums[0]
	// 如果最小值小于 k，则无法满足要求，因为操作无法使得数字变大，返回 -1
	if min < k {
		return -1
	}
	hash := make(map[int]int)
	for i := len(nums) - 1; i >= 0; i-- {
		if nums[i] > k {
			if _, ok := hash[nums[i]]; !ok {
				hash[nums[i]] = i
			}
		}
	}
	return len(hash)
}

func TestMinOperations() {
	nums := []int{5, 2, 5, 4, 5}
	k := 2
	res := minOperations(nums, k)
	println(res)

	nums = []int{9, 7, 5, 3}
	k = 1
	res = minOperations(nums, k)
	println(res)
}

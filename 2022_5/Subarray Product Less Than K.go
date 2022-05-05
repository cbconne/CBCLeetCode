package study2022_5

func NumSubarrayProductLessThanK(nums []int, k int) int {
	l := 0
	res := 0
	product := 1
	for r, num := range nums {
		product *= num
		for product >= k && l <= r {
			product /= nums[l]
			l++
		}
		res += r - l + 1
	}
	return res
}

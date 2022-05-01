package study2022_4

func SmallestRangeI(nums []int, k int) int {
	max := maxInList_20220430(nums)
	min := minInList_20220430(nums)
	if max-min <= 2*k {
		return 0
	} else {
		return max - min - 2*k
	}
}

func maxInList_20220430(nums []int) int {
	max := nums[0]
	for _, v := range nums {
		if v > max {
			max = v
		}
	}
	return max
}

func minInList_20220430(nums []int) int {
	min := nums[0]
	for _, v := range nums {
		if v < min {
			min = v
		}
	}
	return min
}

package Interview_150

import "fmt"

func minSubArrayLen(s int, nums []int) int {
	// 左右指针
	left, right := 0, 0
	// 最小长度
	minLen := len(nums) + 1
	// 当前和
	sum := 0
	for left < len(nums) && right < len(nums) {
		sum += nums[right]
		right++
		// 当前和大于等于s
		for sum >= s {
			minLen = min(minLen, right-left)
			// 左指针右移，尝试缩小长度
			sum -= nums[left]
			left++
		}
	}
	return minLen % (len(nums) + 1)
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}

func MinSubArrayLenTest() {
	s := 7
	nums := []int{2, 3, 1, 2, 4, 3}
	fmt.Println(minSubArrayLen(s, nums))

	s = 4
	nums = []int{1, 4, 4}
	fmt.Println(minSubArrayLen(s, nums))

	s = 11
	nums = []int{1, 1, 1, 1, 1, 1, 1, 1}
	fmt.Println(minSubArrayLen(s, nums))

}

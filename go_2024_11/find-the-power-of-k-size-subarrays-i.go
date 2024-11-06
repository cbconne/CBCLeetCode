package go_2024_11

import "fmt"

func resultsArray(nums []int, k int) []int {
	// 左指针
	left := 0
	// 右指针
	right := k - 1
	// 不满足“连续、增长”的最后节点列表（用左侧的下标表示）
	invalid := -1
	// 结果数组
	res := make([]int, 0)
	// 遍历第一个子数组
	for i := 0; i < k-1; i++ {
		if nums[i] >= nums[i+1] || nums[i]+1 != nums[i+1] {
			invalid = i
		}
	}
	if invalid == -1 {
		res = append(res, nums[right])
	} else {
		res = append(res, -1)
	}
	// 遍历后续子数组
	for right < len(nums)-1 {
		if nums[right] >= nums[right+1] || nums[right]+1 != nums[right+1] {
			invalid = right
		}
		left++
		right++
		if left <= invalid {
			res = append(res, -1)
		} else {
			res = append(res, nums[right])
		}
	}

	return res

}

func ResultArrayTest() {
	nums := []int{3, 2, 3, 2, 3, 2}
	k := 2
	res := resultsArray(nums, k)
	fmt.Print(res)
}

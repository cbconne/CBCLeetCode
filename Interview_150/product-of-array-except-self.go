package Interview_150

import "fmt"

func productExceptSelf(nums []int) []int {
	res := make([]int, len(nums))
	for i := 0; i < len(nums); i++ {
		if i == 0 {
			res[i] = 1
		} else {
			res[i] = res[i-1] * nums[i-1]
		}
	}
	right := 1
	for i := len(nums) - 1; i >= 0; i-- {
		if i == len(nums)-1 {
			res[i] = res[i] * right
		} else {
			right *= nums[i+1]
			res[i] = res[i] * right
		}
	}
	return res
}

func ProductExceptSelfTest() {
	nums := []int{1, 2, 3, 4}
	res := productExceptSelf(nums)
	fmt.Printf("res: %v\n", res)
}

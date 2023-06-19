package study2023_06

import (
	"fmt"
	"math"
)

func maxSumDivThree(nums []int) int {
	// 状态转移方程：
	// f(i,j) 表示前 i 个数选取了若干，且它们之和模 3 余 j 时，和的最大值
	// 不选取当前数时：f(i,j) = f(i-1,j)
	// 选取当前数时：f(i,j) = f(i-1,(j-nums[i])%3) + nums[i]
	// 递推方式便于理解：
	// f(i-1,j) -> f(i,j) 时，不选取当前数，和不变
	// f(i-1,j) + nums[i] -> f(i,(j+nums[i])%3) 时，选取当前数，和增加 nums[i]
	// 由于 f(i,j) 只与 f(i-1,j) 有关，可以使用滚动数组优化空间复杂度

	// 初始化
	f := []int{0, math.MinInt32, math.MinInt32}
	for _, num := range nums {
		g := make([]int, 3)
		for i := 0; i < 3; i++ {
			// 选取当前数
			g[(i+num)%3] = max_of_maxSumDivThree(f[(i+num)%3], f[i]+num)
		}
		f = g
	}
	return f[0]
}

func max_of_maxSumDivThree(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func MaxSumDivThreeTest() {
	// nums := []int{3, 6, 5, 1, 8}
	// 输入：nums = [1,2,3,4,4]
	nums := []int{1, 2, 3, 4, 4}
	fmt.Printf("maxSumDivThree(nums): %v\n", maxSumDivThree(nums))
}

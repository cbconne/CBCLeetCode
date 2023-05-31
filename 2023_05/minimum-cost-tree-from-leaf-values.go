package study2023_05

import "math"

func mctFromLeafValues(arr []int) int {
	// 创建二维列表 DP[i][j]，表示 arr 子序列 arr[i]...arr[j] 的结果
	// 可得递推关系：DP[i][j] =
	// min( max(arr[i]..arr[k]) * max(arr[k+1]..arr[j]) + DP[i][k] + DP[k+1][j] )

	// 创建二维数组
	n := len(arr)
	dp := make([][]int, n)
	for i := 0; i < n; i++ {
		dp[i] = make([]int, n)
	}
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			dp[i][j] = -1
		}
	}
	// 递归求解
	return getDp(arr, 0, n-1, dp)
}

func getDp(arr []int, i int, j int, dp [][]int) int {
	if dp[i][j] != -1 {
		return dp[i][j]
	}
	if i == j {
		dp[i][j] = 0
	} else if i == j-1 {
		dp[i][j] = arr[i] * arr[j]
	} else {
		res := math.MaxInt
		for k := i; k < j; k++ {
			temp := findMax(arr[i:k+1])*findMax(arr[k+1:j+1]) + getDp(arr, i, k, dp) + getDp(arr, k+1, j, dp)
			if temp < res {
				res = temp
			}
		}
		dp[i][j] = res
	}
	return dp[i][j]
}

func findMax(nums []int) int {
	max := nums[0]
	for _, num := range nums {
		if num > max {
			max = num
		}
	}

	return max
}

func findMin(nums []int) int {
	min := nums[0]
	for _, num := range nums {
		if num < min {
			min = num
		}
	}

	return min
}

func MctFromLeafValuesTest() {
	arr := []int{5, 1, 2, 3, 15, 7, 3, 2, 2, 5, 9, 1, 11, 9, 15, 14, 7, 1, 5}
	println(mctFromLeafValues(arr))
}

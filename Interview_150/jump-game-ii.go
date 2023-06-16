package Interview_150

// func jump(nums []int) int {
// 	// res[i] 表示第 i 个位置到达最后一个位置的最小跳跃次数
// 	res := make([]int, len(nums))
// 	// 初始化，设置为极大值
// 	for i := 0; i < len(nums)-1; i++ {
// 		res[i] = math.MaxInt - 1000
// 	}

// 	// 倒序遍历
// 	for i := len(nums) - 2; i >= 0; i-- {
// 		// 若该位置可直接到达最后一个位置，则跳跃次数为 1
// 		if nums[i]+i >= len(nums)-1 {
// 			res[i] = 1
// 			continue
// 		} else {
// 			// 否则，跳跃次数为 1 + 从该位置可跳跃到的位置中的最小跳跃次数
// 			res[i] = 1 + minInList(res[i:i+nums[i]+1])
// 		}
// 	}
// 	return res[0]
// }

// func minInList(nums []int) int {
// 	min := nums[0]
// 	for _, v := range nums {
// 		if v < min {
// 			min = v
// 		}
// 	}
// 	return min
// }

func jump(nums []int) int {
	step := 0
	// 记录最远距离
	far := 0
	// 记录边界
	bound := 0
	for i, num := range nums {
		if i == len(nums)-1 {
			break
		}
		if far < i+num {
			far = i + num
		}
		if i >= bound {
			step++
			bound = far
		}
	}
	return step
}

func JumpTest() {
	// nums := []int{2, 3, 1, 1, 4}
	// 输入: nums = [2,3,0,1,4]
	nums := []int{2, 3, 0, 1, 4}
	println(jump(nums))
}

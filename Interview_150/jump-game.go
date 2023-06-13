package Interview_150

// canJump 函数用于判断是否能够从第一个索引跳到最后一个索引
func canJump(nums []int) bool {
	// 最远距离（初始值为0）
	furthest := 0
	for i, num := range nums {
		// 如果当前索引已经是最后一个索引，则跳出循环
		if i == len(nums)-1 {
			break
		}
		// 如果当前索引小于等于最远距离，并且从当前索引可以跳到更远的距离，则更新最远距离
		if i <= furthest && i+num > furthest {
			furthest = i + num
			// 如果最远距离已经可以到达最后一个索引，则返回 true
			if furthest >= len(nums)-1 {
				return true
			}
		}
	}
	// 最终判断最远距离是否可以到达最后一个索引
	return furthest >= len(nums)-1
}

// CanJumpTest 函数用于测试 canJump 函数
func CanJumpTest() {
	// 测试用例1
	// nums := []int{2, 3, 1, 1, 4}
	// 测试用例2
	nums := []int{3, 2, 1, 0, 4}
	println(canJump(nums))
}

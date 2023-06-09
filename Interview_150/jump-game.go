package Interview_150

func canJump(nums []int) bool {
	// 最远距离（初始值为0）
	furthest := 0
	for i, num := range nums {
		if i == len(nums)-1 {
			break
		}
		if i <= furthest && i+num > furthest {
			furthest = i + num
			if furthest >= len(nums)-1 {
				return true
			}
		}
	}
	return furthest >= len(nums)-1
}

func CanJumpTest() {
	// nums := []int{2, 3, 1, 1, 4}
	nums := []int{3, 2, 1, 0, 4}
	println(canJump(nums))
}

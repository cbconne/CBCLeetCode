package study2023_06

func applyOperations(nums []int) []int {
	// 新建结果数组，初始值均为0
	res := make([]int, len(nums))
	for i := range res {
		res[i] = 0
	}

	// 创建指针指向 res 起点
	res_a := 0

	// 遍历
	for i := range nums {
		if nums[i] == 0 {
			continue
		} else if i == len(nums)-1 {
			res[res_a] = nums[i]
		} else if nums[i] == nums[i+1] {
			res[res_a] = nums[i] * 2
			nums[i+1] = 0
		} else {
			res[res_a] = nums[i]
		}
		res_a++
	}

	return res
}

func ApplyOperationsTest() {
	// 输入：nums = [1,2,2,1,1,0]
	// nums := []int{1, 2, 2, 1, 1, 0}
	//输入：nums = [0,1]
	nums := []int{0, 1}
	for _, item := range applyOperations(nums) {
		print(item, " ")
	}
}

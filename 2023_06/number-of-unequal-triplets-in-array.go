package study2023_06

// 计算一个整数数组中不同的三元组的数量
func unequalTriplets(nums []int) int {
	// 使用 map 统计每个数字出现的次数
	hash := make(map[int]int)
	for _, v := range nums {
		hash[v]++
	}
	res := 0
	// 从 hash 中取不同的三个数
	for i := range hash {
		for j := range hash {
			for k := range hash {
				// 确保 i < j < k
				if i < j && j < k {
					res += hash[i] * hash[j] * hash[k]
				}
			}
		}
	}

	return res
}

// 测试函数
func UnequalTripletsTest() {
	// 输入：nums = [1,1,1,1,1]
	nums := []int{1, 1, 1, 1, 1}
	println(unequalTriplets(nums))
}

package study2023_06

import "sort"

func miceAndCheese(reward1 []int, reward2 []int, k int) int {
	// 计算每块奶酪被第一只老鼠吃掉能多获取的分数
	diff_reward := make([]int, len(reward1))
	for i := range reward1 {
		diff_reward[i] = reward1[i] - reward2[i]
	}

	// 按照数量从大到小排序
	sort.Sort(sort.Reverse(sort.IntSlice(diff_reward)))

	// 计算全部被第二只老鼠吃掉时的分数
	sum := 0
	for _, reward := range reward2 {
		sum += reward
	}

	// 增加前 k 块被第一只老鼠吃掉增加的分数
	for i := 0; i < k; i++ {
		sum += diff_reward[i]
	}
	return sum
}

func MiceAndCheeseTest() {
	// 输入：reward1 = [1,1,3,4], reward2 = [4,4,1,1], k = 2
	// reward1 := []int{1, 1, 3, 4}
	// reward2 := []int{4, 4, 1, 1}
	// k := 2
	// 输入：reward1 = [1,1], reward2 = [1,1], k = 2
	reward1 := []int{1, 1}
	reward2 := []int{1, 1}
	k := 2
	println(miceAndCheese(reward1, reward2, k))
}

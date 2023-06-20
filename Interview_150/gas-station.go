package Interview_150

func canCompleteCircuit(gas []int, cost []int) int {
	sum, total, start := 0, 0, 0
	for total < len(gas) {
		// 当前点出发能否到达下一个点
		sum += gas[(start+total)%len(gas)] - cost[(start+total)%len(gas)]
		// 如果不能到达下一个点
		if sum < 0 {
			// 从下一个点开始重新计算
			start = (start + total + 1)
			// 如果下一个点已经超过了数组长度，说明无法完成
			if start >= len(gas) {
				return -1
			}
			// 重置sum
			sum = 0
			// 重置total
			total = 0
		} else {
			// 如果能到达下一个点，继续前进
			total++
		}
	}
	return start
}

func CanCompleteCircuitTest() {
	// gas := []int{1, 2, 3, 4, 5}
	// cost := []int{3, 4, 5, 1, 2}
	// gas := []int{2, 3, 4}
	// cost := []int{3, 4, 3}
	//[6,1,4,3,5]
	//[3,8,2,4,2]
	gas := []int{6, 1, 4, 3, 5}
	cost := []int{3, 8, 2, 4, 2}

	res := canCompleteCircuit(gas, cost)
	println(res)
}

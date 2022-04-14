package study2022_4

func MaximumWealth(accounts [][]int) int {
	max := -1
	for i := range accounts {
		sum := 0
		for j := range accounts[i] {
			sum += accounts[i][j]
		}
		if sum > max {
			max = sum
		}
	}
	return max
}

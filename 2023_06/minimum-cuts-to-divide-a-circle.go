package study2023_06

func numberOfCuts(n int) int {
	if n == 1 {
		return 0
	}
	// 切成 n 份需要切 n 刀
	res := n
	// 当 n 为偶数时，在同一直线上的两刀可以合为一刀
	if res%2 == 0 {
		res /= 2
	}
	return res
}

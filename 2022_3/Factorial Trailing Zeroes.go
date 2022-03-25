package study2022_3

func TrailingZeroes(n int) int {
	if n == 0 {
		return 0
	}
	res := 0
	for i := 1; i <= n/5; i++ {
		res += getCountof5inPrimeFactors(i) + 1
	}
	return res
}

func getCountof5inPrimeFactors(n int) int {
	cnt := 0
	for {
		if n%5 == 0 {
			cnt++
			n /= 5
			continue
		}
		return cnt
	}
}

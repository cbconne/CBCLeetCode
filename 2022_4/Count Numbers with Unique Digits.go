package study2022_4

func CountNumbersWithUniqueDigits(n int) int {
	if n == 0 {
		return 1
	}

	if n == 1 {
		return 10
	}

	count := 9
	for i := 2; i <= n; i++ {
		count *= 9 - i + 2
	}

	return count + CountNumbersWithUniqueDigits(n-1)
}

package study2022_3

func FindKthNumber(n int, k int) int {
	prifix := 1
	times := 1
	for times < k {
		c := getCountinPrifix(prifix, n)
		if times+c <= k {
			prifix += 1
			times += c
		} else {
			prifix *= 10
			times += 1
		}
	}
	return prifix
}

func getCountinPrifix(prifix int, n int) int {
	cnt := 1
	l := prifix * 10
	r := prifix*10 + 9
	for l <= n {
		cnt += min(r, n) - l + 1
		l *= 10
		r = r*10 + 9
	}
	return cnt
}

func min(a int, b int) int {
	if a <= b {
		return a
	} else {
		return b
	}
}

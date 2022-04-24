package study2022_4

func BinaryGap(n int) int {
	last := -1
	res := 0
	for i := 0; n > 0; i += 1 {
		if n&1 == 1 {
			if last != -1 {
				res = max_20220424(res, i-last)
			}
			last = i
		}
		n >>= 1
	}
	return res
}

func max_20220424(a, b int) int {
	if a > b {
		return a
	}
	return b
}

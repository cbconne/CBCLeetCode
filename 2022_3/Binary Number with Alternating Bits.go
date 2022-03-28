package study2022_3

func HasAlternatingBits(n int) bool {
	last := -1
	for n > 0 {
		if n%2 == last {
			return false
		}
		last = n % 2
		n /= 2
	}
	return true
}

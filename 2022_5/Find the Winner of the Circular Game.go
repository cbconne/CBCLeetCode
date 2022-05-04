package study2022_5

func FindTheWinner(n int, k int) int {
	if n == 1 {
		return 1
	}
	if res := (k + FindTheWinner(n-1, k)) % n; res == 0 {
		return n
	} else {
		return res
	}
}

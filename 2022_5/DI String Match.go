package study2022_5

func DiStringMatch(s string) []int {
	n := len(s)
	mark := []int{0, n}
	res := []int{}
	for _, char := range s {
		if char == 'D' {
			res = append(res, mark[1])
			mark[1]--
		} else {
			res = append(res, mark[0])
			mark[0]++
		}
	}
	res = append(res, mark[1])
	return res
}

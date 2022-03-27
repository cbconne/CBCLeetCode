package study2022_3

func MissingRolls(rolls []int, mean int, n int) []int {
	res := make([]int, 0)
	// sum of rolls
	sum_r := 0
	for _, v := range rolls {
		sum_r += v
	}
	sumn := (n+len(rolls))*mean - sum_r
	if sumn < n || sumn > 6*n {
		return res
	}
	le := sumn / n
	mo := le + 1
	cnt_mo := sumn - n*le
	cnt_le := n - cnt_mo
	s_mo := make([]int, cnt_mo)
	s_le := make([]int, cnt_le)
	for i := range s_mo {
		s_mo[i] = mo
	}
	for i := range s_le {
		s_le[i] = le
	}
	res = append(res, s_le...)
	res = append(res, s_mo...)
	return res
}

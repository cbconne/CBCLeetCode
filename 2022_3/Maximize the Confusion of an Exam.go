package study2022_3

func MaxConsecutiveAnswers(answerKey string, k int) int {
	l := 0
	r := -1
	res := 0
	cnt_T := 0
	cnt_F := 0
	for {
		if r <= len(answerKey)-1 &&
			Min(cnt_T, cnt_F) <= k {
			res = Max(res, r-l+1)
			r++
			if r >= len(answerKey) {
				break
			}
			if answerKey[r] == 'T' {
				cnt_T++
			} else {
				cnt_F++
			}
		} else {
			if answerKey[l] == 'T' {
				cnt_T--
			} else {
				cnt_F--
			}
			if l++; l >= r {
				break
			}
		}
	}
	return res
}

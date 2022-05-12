package study2022_5

func MinDeletionSize(strs []string) int {
	res := 0
	for i := range strs[0] {
		for j := 0; j < len(strs)-1; j++ {
			if strs[j][i] > strs[j+1][i] {
				res++
				break
			}
		}
	}
	return res
}

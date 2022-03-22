package study2022_3

func WinnerOfGame(colors string) bool {

	time := map[rune]int{'A': 0, 'B': 0}
	curS := 'C'
	cnt := 1

	for _, c := range colors {
		if c != curS {
			curS = c
			cnt = 1
		} else {
			cnt++
			if cnt >= 3 {
				time[curS]++
			}
		}
	}

	return time['A'] > time['B']
}

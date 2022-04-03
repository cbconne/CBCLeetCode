package study2022_4

func NextGreatestLetter(letters []byte, target byte) byte {
	temp := 27
	var res byte
	for _, letter := range letters {
		diff := diffBetween(letter, target)
		if diff < temp {
			res = letter
			temp = diff
		}
	}
	return res
}

func diffBetween(letter, target byte) int {
	if letter > target {
		return int(letter - target)
	} else {
		return int(letter + 26 - target)
	}
}

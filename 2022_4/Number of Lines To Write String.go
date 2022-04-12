package study2022_4

func NumberOfLines(widths []int, s string) []int {
	line := 1
	length := 0

	for _, ch := range s {
		if length+widths[ch-'a'] > 100 {
			line++
			length = widths[ch-'a']
		} else {
			length += widths[ch-'a']
		}
	}
	return []int{line, length}
}

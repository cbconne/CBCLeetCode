package study2022_4

import (
	"regexp"
	"strings"
)

func LengthLongestPath(input string) int {
	res := 0
	length := make(map[int]int)
	r := regexp.MustCompile("\n")
	lines := r.Split(input, -1)
	for _, line := range lines {
		depth := strings.Count(line, "\t")
		if depth == 0 {
			length[depth] = len(line) - depth + 1
		} else {
			length[depth] = len(line) - depth + 1 + length[depth-1]
		}
		if strings.Contains(line, ".") {
			res = max_20220420(res, length[depth]-1)
		}
	}
	return res
}

func max_20220420(a, b int) int {
	if a > b {
		return a
	}
	return b
}

package study2022_4

import "strings"

func RotateString(s string, goal string) bool {
	if len(s) != len(goal) {
		return false
	}
	temp := s + s
	return strings.Contains(temp, goal)
}

package study2022_5

import "strings"

func RemoveOuterParentheses(s string) string {
	if s == "" {
		return ""
	}
	var res strings.Builder
	cntL := 0
	for i := 0; i < len(s); i++ {
		c := s[i]
		if c == '(' {
			if cntL != 0 {
				res.WriteByte(c)
			}
			cntL++
		} else {
			cntL--
			if cntL != 0 {
				res.WriteByte(c)
			}
		}
	}
	return res.String()
}

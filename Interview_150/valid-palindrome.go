package Interview_150

import (
	"fmt"
	"strings"
)

func isPalindrome(s string) bool {
	// 移除非字母和数字的字符
	var newS string
	for i := 0; i < len(s); i++ {
		if isalnum(s[i]) {
			newS += string(s[i])
		}
	}
	// 转换为小写
	newS = strings.ToLower(newS)
	// 判断是否为回文
	for i := 0; i < len(newS)/2; i++ {
		if newS[i] != newS[len(newS)-1-i] {
			return false
		}
	}
	return true
}

func isalnum(ch byte) bool {
	return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')
}

func IsPalindromeTest() {
	s := "A man, a plan, a canal: Panama"
	fmt.Println(isPalindrome(s))
}

package Interview_150

import (
	"fmt"
	"strings"
)

func lengthOfLastWord(s string) int {
	// 去除字符串首尾空格
	s = strings.TrimSpace(s)
	// 字符串根据空格分割
	strs := strings.Split(s, " ")
	// 获取最后一个字符串
	lastStr := strs[len(strs)-1]
	// 返回最后一个字符串的长度
	return len(lastStr)
}

func LengthOfLastWordTest() {
	fmt.Println(lengthOfLastWord("Hello World"))                 // 5
	fmt.Println(lengthOfLastWord("   fly me   to   the moon  ")) // 4
	fmt.Println(lengthOfLastWord("luffy is still joyboy"))       // 6
}

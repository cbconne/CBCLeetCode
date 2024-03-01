package Interview_150

import (
	"fmt"
	"strings"
)

func reverseWords(s string) string {

	// 1. split the string s by space
	splits := strings.Split(s, " ")
	// 2. reverse the splits and remove the empty string
	for i, j := 0, len(splits)-1; i < j; i, j = i+1, j-1 {
		splits[i], splits[j] = splits[j], splits[i]
	}
	// 3. join the splits by space and remove the empty string
	for i := 0; i < len(splits); i++ {
		if splits[i] == "" {
			splits = append(splits[:i], splits[i+1:]...)
			i--
		}
	}
	return strings.Join(splits, " ")
}

func ReverseWordsTest() {
	s := "the sky is blue"
	res := reverseWords(s)
	fmt.Printf("res: %v\n", res)

	s = "  hello world  "
	res = reverseWords(s)
	fmt.Printf("res: %v\n", res)

	s = "a good   example"
	res = reverseWords(s)
	fmt.Printf("res: %v\n", res)
}

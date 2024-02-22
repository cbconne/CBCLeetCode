package Interview_150

import "fmt"

func longestCommonPrefix(strs []string) string {
	// 公共前缀
	prefix := ""
	// 获取最短字符串长度，若存在空字符串则返回空字符串
	min_len := len(strs[0])
	for _, str := range strs {
		if len(str) == 0 {
			return prefix
		}
		if len(str) < min_len {
			min_len = len(str)
		}
	}

	for i := 0; i < min_len; i++ {
		for j := 1; j < len(strs); j++ {
			if strs[j][i] != strs[0][i] {
				return prefix
			}
		}
		prefix += string(strs[0][i])
	}

	return prefix

}

func LongestCommonPrefixTest() {
	fmt.Println(longestCommonPrefix([]string{"flower", "flow", "flight"})) // "fl"
	fmt.Println(longestCommonPrefix([]string{"dog", "racecar", "car"}))    // ""
}

package Interview_150

import "fmt"

func lengthOfLongestSubstring(s string) int {
	// 哈希集合，记录每个字符是否出现过
	m := map[byte]int{}
	n := len(s)
	// 左右指针
	left := 0
	right := 0
	// 最长子串的长度
	res := 0

	for right < n {
		// 右指针移动
		if _, ok := m[s[right]]; !ok {
			// 若当前字符不在哈希集合中，则将其加入哈希集合, 并将右指针右移
			m[s[right]] = 1
			right++
			// 更新最长子串的长度
			res = max(res, right-left)
		} else {
			// 若当前字符在哈希集合中，则将左指针右移，直到当前字符不在哈希集合中
			delete(m, s[left])
			left++
		}
	}

	return res
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func LengthOfLongestSubstringTest() {
	s := "abcabcbb"
	fmt.Println(lengthOfLongestSubstring(s))
	s = "bbbbb"
	fmt.Println(lengthOfLongestSubstring(s))
	s = "pwwkew"
	fmt.Println(lengthOfLongestSubstring(s))
}

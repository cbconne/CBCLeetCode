package Interview_150

import "fmt"

func minWindow(s string, t string) string {
	// 将 t 中的字符及其出现次数存储到 map 中
	need := make(map[byte]int)
	for i := 0; i < len(t); i++ {
		need[t[i]]++
	}

	// 定义左右指针和窗口
	left, right := 0, 0
	window := make(map[byte]int)
	start, length := 0, len(s)+1

	for right < len(s) {
		// 移动右指针
		window[s[right]]++
		right++

		// 判断左侧窗口是否需要收缩
		for check(need, window) {
			// check 为 true，说明目前窗口满足条件
			// 更新最小覆盖子串
			if right-left < length {
				start = left
				length = right - left
			}

			// 移动左指针，尝试缩小窗口
			window[s[left]]--
			left++
		}
		// 不满足条件，继续移动右指针
	}

	if length == len(s)+1 {
		return ""
	}
	return s[start : start+length]

}

func check(need map[byte]int, window map[byte]int) bool {
	for k, v := range need {
		if window[k] < v {
			return false
		}
	}
	return true
}

func MinWindowTest() {

	s := "ADOBECODEBANC"
	t := "ABC"
	fmt.Println(minWindow(s, t))

	s = "a"
	t = "a"
	fmt.Println(minWindow(s, t))

	s = "a"
	t = "aa"
	fmt.Println(minWindow(s, t))

}

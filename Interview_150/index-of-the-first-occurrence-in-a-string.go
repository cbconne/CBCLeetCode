package Interview_150

import "fmt"

func strStr(haystack string, needle string) int {
	// 指针 i 指向 haystack，指针 j 指向 needle
	i := 0
	j := 0
	temp := 0
	// 若 needle 长度大于 haystack，则返回 -1
	if len(needle) > len(haystack) {
		return -1
	}
	// 进入循环，直至 i + len(needle) 大于 len(haystack) 时退出
	for i+len(needle) <= len(haystack) {
		// 若 haystack[i] 与 needle[j] 相等，则 i++，j++
		if haystack[i+temp] == needle[j] {
			temp++
			j++
			// 若 j 等于 needle 长度，说明找到了 needle
			if j == len(needle) {
				return i + temp - j
			}
		} else {
			// 若 haystack[i] 与 needle[j] 不相等，则 i 回退到上一个匹配的位置 + 1，j 重置为 0
			i = i + 1
			j = 0
			temp = 0
		}
	}
	return -1
}

func StrStrTest() {
	haystack := "hello"
	needle := "ll"
	fmt.Println(strStr(haystack, needle)) //2
	haystack = "aaaaa"
	needle = "bba"
	fmt.Println(strStr(haystack, needle)) //-1
	haystack = "sadbutsad"
	needle = "sad"
	fmt.Println(strStr(haystack, needle)) //0
	haystack = "mississippi"
	needle = "issip"
	fmt.Println(strStr(haystack, needle)) //0
}

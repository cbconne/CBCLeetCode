package go_2024_11

import "fmt"

// 该方法存在性能问题，提交后超时，需要使用前缀和进行优化
func countKConstraintSubstrings(s string, k int, queries [][]int) []int64 {

	resList := make([]int64, len(queries))

	for i := 0; i < len(queries); i++ {
		// 获取当前查询的子串
		start := queries[i][0]
		end := queries[i][1] + 1
		subStr := s[start:end]
		// 计算当前子串满足条件的子串数量
		res := countKConstraintSubstringsBase(subStr, k)
		// 将结果保存到结果数组中
		resList[i] = res
	}

	return resList
}

func countKConstraintSubstringsBase(s string, k int) int64 {
	// 滑动窗口
	var left int64 = 0
	var right int64 = 0
	var reResult int64 = 0

	for right < int64(len(s)) {
		// 判断当前窗口内是否满足条件
		subStr := s[left : right+1]
		if check(subStr, k) {
			// 满足需求，右指针向右移动
			right++
			continue
		} else {
			// 不满足需求，计算当前左边界开始的不满足条件的子串数量，并更新左边界
			reResult += int64(len(s)) - right
			left++
		}
	}
	// 最终结果为全部子串的数量减去不满足条件的子串数量
	// s 的子串数量
	allSubString := int64(len(s) * (len(s) + 1) / 2)
	return allSubString - reResult
}

func check(subString string, k int) bool {
	// 判断子串是否满足条件，0 or 1 的数量不超过 k
	k0 := k
	k1 := k
	for _, char := range subString {
		if char == '0' {
			k0--
		} else {
			k1--
		}
	}
	if k0 < 0 && k1 < 0 {
		return false
	} else {
		return true
	}
}

func CountKConstraintSubstringsTest() {
	s := "0001111"
	k := 2
	queries := [][]int{{0, 6}}
	res := countKConstraintSubstrings(s, k, queries)
	fmt.Println(res)

	s = "010101"
	k = 1
	queries = [][]int{{0, 5}, {1, 4}, {2, 3}}
	res = countKConstraintSubstrings(s, k, queries)
	fmt.Println(res)
}

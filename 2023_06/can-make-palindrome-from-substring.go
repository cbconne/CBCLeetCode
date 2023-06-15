package study2023_06

import "math/bits"

func canMakePaliQueries(s string, queries [][]int) []bool {
	// 创建前缀和数组：二进制数数组，数组长度为 len(s)+1，二进制数长度为26（以上）
	// 二进制数的每一位代表字母出现的奇偶性，1代表奇数，0代表偶数
	sum := make([]uint32, len(s)+1)

	// 遍历字符串 s，计算前缀和数组
	for i, ch := range s {
		sum[i+1] = sum[i] ^ (1 << (ch - 'a'))
	}

	res := make([]bool, len(queries))

	// 遍历 queries，计算结果
	for i, q := range queries {
		// 计算子串代表各字母出现奇偶性的二进制数
		qs := sum[q[0]] ^ sum[q[1]+1]
		// 计算其中 1 的个数（既有奇数个的字母数）
		count := bits.OnesCount32(qs)
		// 计算需要修改的次数
		res[i] = count/2 <= q[2]
	}
	return res
}

func CanMakePaliQueriesTest() {
	//输入：s = "abcda", queries = [[3,3,0],[1,2,0],[0,3,1],[0,3,2],[0,4,1]]
	s := "abcda"
	queries := [][]int{{3, 3, 0}, {1, 2, 0}, {0, 3, 1}, {0, 3, 2}, {0, 4, 1}}
	res := canMakePaliQueries(s, queries)
	for _, v := range res {
		println(v)
	}
}

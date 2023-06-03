package study2023_06

func maxRepOpt1(text string) int {
	// 统计字符串中各字符数量
	cnt_char := make(map[byte]int)
	for i := range text {
		cnt_char[text[i]]++
	}
	// 设置左右指针
	left, right := 0, 0
	// 设置最大长度
	max_len := 1
	// 设置最大字符(Byte)
	// max_char := byte(0)

	for left < len(text) {
		// 右指针右移
		right++
		// 若达到边界
		if right == len(text) {
			break
		}
		if text[right] == text[left] {
			// 若右指针指向字符与左指针指向字符相同
			// 比较当前左右指针长度和最大长度
			if right-left+1 >= max_len {
				max_len = right - left + 1
				// max_char = text[left]
				if right == len(text)-1 && max_len < cnt_char[text[left]] {
					max_len++
				}
			}
			continue
		} else if text[right] != text[left] {
			// 若右指针指向字符与左指针指向字符不同
			// 比较当前左指针所指向字符数量与当前左右指针长度
			if cnt_char[text[left]] > right-left {
				// 若当前左指针所指向字符数量大于当前左右指针长度
				// 说明该字符数量还可以增加
				// 判断通过交换是否连接了相同字符
				if right < len(text)-1 && text[right+1] == text[left] {
					// 若连接了相同字符
					right_temp := right + 1
					for ; right_temp < len(text); right_temp++ {
						if text[right_temp] != text[left] {
							if right_temp-left > max_len {
								max_len = min(right_temp-left, cnt_char[text[left]])
								// max_char = text[left]
							}
							break
						}
					}
					// 直到字符串结束都是相同字符
					if right_temp == len(text) &&
						len(text)-left > max_len {
						max_len = min(len(text)-left, cnt_char[text[left]])
						// max_char = text[left]
					}
					left = right
					continue
				} else {
					// 若没有连接相同字符
					// 结果为当前左右指针长度（通过交换增加了1个字符）
					if right-left+1 > max_len {
						max_len = right - left + 1
						// max_char = text[left]
					}
					// 左指针移动至右指针位置
					left = right
					continue
				}
			} else if cnt_char[text[left]] == right-left {
				// 若当前左指针所指向字符数量等于当前左右指针长度
				// 说明该字符数量已经达到最大，无法再增加
				// 左指针移动至右指针位置
				left = right
				continue
			}

		}
	}
	return max_len

}

// func max(a, b int) int {
// 	if a >= b {
// 		return a
// 	} else {
// 		return b
// 	}
// }

func min(a, b int) int {
	if a >= b {
		return b
	} else {
		return a
	}
}

func MaxRepOpt1Test() {
	text := "ababa"
	// res := maxRepOpt1(text)
	// println(res)
	// // 输入：text = "aaabaaa"
	// text = "aaabaaa"
	// println(maxRepOpt1(text))
	// // 输入：text = "aaabbaaa"
	// text = "aaabbaaa"
	// println(maxRepOpt1(text))
	// // 输入：text = "aaaaa"
	// text = "aaaaa"
	// println(maxRepOpt1(text))
	// // "aabbaba"
	// text = "aabbaba"
	// println(maxRepOpt1(text))
	// // "acbaaa"
	// text = "acbaaa"
	// println(maxRepOpt1(text))
	// "aaabaaabbaaaaaaa"
	text = "aaabaaabbaaaaaaa"
	println(maxRepOpt1(text))
}

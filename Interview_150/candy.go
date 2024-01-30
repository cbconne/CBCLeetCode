package Interview_150

import "fmt"

func candy(ratings []int) int {
	// 记录答案
	ans := 0
	// 记录 left 糖果数
	left := 1
	// 记录递增序列的最后一个位置的糖果数即为递增序列的长度
	asc_len := 1
	// 记录递减许列第一个位置的糖果数即为递减序列的长度
	desc_len := 0

	// 遍历数组，从左到右
	for i, v := range ratings {
		// 记录当前位置的糖果数
		cur := 0

		// 若当前位置是第一个位置，则当前位置的糖果数为 1
		if i == 0 {
			ans += 1
			continue
		}
		// 若当前位置比前一个位置的评分高，则在前一个位置的糖果数上加一
		if v > ratings[i-1] {
			cur = left + 1
			// 更新左侧糖果数
			left++
			// 更新递增序列长度
			asc_len = left
			// 重置递减序列长度
			desc_len = 0
			ans += cur
		} else if v == ratings[i-1] {
			// 若当前位置的评分和前一个位置的评分相同，则当前位置的糖果数为 1
			// 重置左侧糖果数
			left = 1
			// 重置递增序列长度
			asc_len = 1
			// 重置递减序列长度
			desc_len = 0
			ans += 1
		} else {
			// 否则，当前位置在递减序列中
			desc_len++
			// 总体糖果数需要新增递减序列长度
			ans += desc_len
			// 若递减序列长度等于递增序列长度，则需要将递增序列的最后一个位置计入递减序列中
			if desc_len == asc_len {
				ans++
				desc_len++
			}
			left = 1
		}
		fmt.Printf("left: %v\n", left)
	}

	return ans

}

func CandyTest() {
	ratings := []int{1, 2, 3, 5, 4, 3, 2, 1, 4, 3, 2, 1}
	res := candy(ratings)
	fmt.Printf("res: %v\n", res)
}

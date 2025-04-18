package go_2025_04

import "fmt"

func countBadPairs(nums []int) int64 {
	// 总数对：C(2,n)=n*(n-1)/2
	total := (len(nums) * (len(nums) - 1)) / 2
	// 通过 hash 表统计“好”数对
	m := make(map[int]int)
	cnt_good := 0
	for i, num := range nums {
		// 统计好数对
		cnt_good += m[num-i]
		m[num-i]++
	}
	return int64(total - cnt_good)
}

func TestCountBadPairs() {
	nums := []int{4, 1, 3, 3}
	fmt.Println(countBadPairs(nums))
}

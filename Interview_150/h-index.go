package Interview_150

import "fmt"

func hIndex(citations []int) int {
	counter := make([]int, len(citations)+1)
	for _, v := range citations {
		if v >= len(citations) {
			counter[len(citations)]++
		} else {
			counter[v]++
		}
	}
	for i := len(citations); i >= 0; i-- {
		if counter[i] >= i {
			return i
		}
		counter[i-1] += counter[i]
	}
	return 0
}

func HIndexTest() {
	fmt.Printf("hIndex([]int{3, 0, 6, 1, 5}): %v\n", hIndex([]int{3, 0, 6, 1, 5}))
}

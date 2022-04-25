package study2022_4

import "math/rand"

type Solution struct {
	nums []int
}

func Constructor_20220425(nums []int) Solution {
	return Solution{nums}
}

func (this *Solution) Pick(target int) int {
	var res int
	cnt := 1
	for i, num := range this.nums {
		if num == target {
			if rand.Intn(cnt) == 0 {
				res = i
			}
			cnt++
		}
	}
	return res
}

/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.Pick(target);
 */

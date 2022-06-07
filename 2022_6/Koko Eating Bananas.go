package study2022_6

import "math"

func MinEatingSpeed(piles []int, h int) int {
	l, r := 1, max_20220607(piles)
	for l < r {
		mid := l + (r-l)/2
		if canEat(piles, h, mid) {
			r = mid
		} else {
			l = mid + 1
		}
	}
	return l
}

func canEat(piles []int, h int, mid int) bool {
	sum := 0
	for _, p := range piles {
		sum += int(math.Ceil(float64(p) / float64(mid)))
	}
	return sum <= h
}

func max_20220607(piles []int) int {
	max := 0
	for _, p := range piles {
		if p > max {
			max = p
		}
	}
	return max
}

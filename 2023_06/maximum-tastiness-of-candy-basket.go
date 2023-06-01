package study2023_06

import "sort"

func maximumTastiness(price []int, k int) int {
	// 排序
	sort.Ints(price)
	min_tastiness := 0
	max_tastiness := price[len(price)-1] - price[0]
	for min_tastiness < max_tastiness {
		mid := (min_tastiness + max_tastiness) / 2
		if checkTastinessIsOk(price, mid, k) {
			if min_tastiness == mid {
				if checkTastinessIsOk(price, max_tastiness, k) {
					min_tastiness = max_tastiness
					break
				} else {
					break
				}
			}
			min_tastiness = mid
		} else {
			max_tastiness = mid
		}
	}
	return min_tastiness
}

func checkTastinessIsOk(price []int, tastiness int, k int) bool {
	last_price := price[0]
	cnt := 1
	for _, elem := range price {
		if elem-last_price >= tastiness {
			cnt++
			last_price = elem
		}
	}
	return cnt >= k
}

func MaximunTastinessTest() {
	price := []int{1, 3, 1}
	k := 2
	res := maximumTastiness(price, k)
	println(res)
}

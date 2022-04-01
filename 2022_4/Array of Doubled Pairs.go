package study2022_4

import (
	"math"
	"sort"
)

func CanReorderDoubled(arr []int) bool {
	hashMap := make(map[int]int)
	for _, v := range arr {
		hashMap[v] = hashMap[v] + 1
	}
	unique := make([]int, 0, len(arr))
	for key := range hashMap {
		unique = append(unique, key)
	}
	sort.Slice(unique, func(i, j int) bool {
		return math.Abs(float64(unique[i])) < math.Abs(float64(unique[j]))
	})
	for _, v := range unique {
		if hashMap[v] > hashMap[2*v] {
			return false
		} else {
			hashMap[2*v] = hashMap[2*v] - hashMap[v]
			hashMap[v] = 0
		}
	}
	return true
}

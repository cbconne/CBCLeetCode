package go_2025_03

import (
	"maps"
	"math"
	"slices"
)

func beautifulSubsets(nums []int, k int) int {
	// 将 nums 中的元素对 k 取余，根据余数进行分组
	// groups[余数][元素值] = 出现的次数
	groups := map[int]map[int]int{}
	for _, v := range nums {
		// 对 k 取余, 余数相同的元素分为一组
		r := v % k
		if groups[r] == nil {
			groups[r] = map[int]int{}
		}
		groups[r][v]++
	}
	ans := 1
	for _, c := range groups {
		// 计算美丽子集的数量
		ans *= caculateCnt(c, k)
	}
	return ans - 1
}

// 计算美丽子集的数量
func caculateCnt(groups map[int]int, k int) int {
	// groups[元素值] = 出现的次数
	// 排序
	sortGroup := slices.Sorted(maps.Keys(groups))

	length := len(sortGroup)
	if length == 0 {
		return 1
	}
	f := make([]int, length+1)
	// 初始化
	// f[0] 表示从0开始，长度为0的范围内选择子集
	f[0] = 1
	// f[1] 表示从0开始，长度为1的范围内选择子集
	f[1] = intPow(2, groups[sortGroup[0]])
	for i := 1; i < length; i++ {
		count := groups[sortGroup[i]]
		if sortGroup[i] == sortGroup[i-1]+k {
			// 相邻元素差值为k，无法选择，跳过
			f[i+1] = f[i] + f[i-1]*(intPow(2, count)-1)
		} else {
			f[i+1] = f[i] + f[i]*(intPow(2, count)-1)
		}
	}
	return f[length]
}

func intPow(x, y int) int {
	return int(math.Pow(float64(x), float64(y)))
}

func TestBeautifulSubsets() {
	nums := []int{1, 2, 3, 3}
	k := 1
	// 输出应当为 8，实际为 6
	println(beautifulSubsets(nums, k))
}

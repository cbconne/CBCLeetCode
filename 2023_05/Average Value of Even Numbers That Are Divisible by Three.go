package study2023_05

func averageValue(nums []int) int {
	var sum int
	var count int
	for _, num := range nums {
		if num%6 == 0 {
			sum += num
			count++
		}
	}
	if count == 0 {
		return 0
	}
	return sum / count
}

func AverageValueTest() {
	nums := []int{1, 3, 6, 10, 12, 15}
	println(averageValue(nums))
}

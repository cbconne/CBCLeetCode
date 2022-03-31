package study2022_3

func SelfDividingNumbers(left int, right int) []int {

	res := make([]int, 0)
	for i := left; i <= right; i++ {
		if isSelfDividing(i) {
			res = append(res, i)
		}
	}
	return res
}

func isSelfDividing(number int) bool {
	if number < 10 {
		return true
	}

	temp := number

	for number > 0 {
		if number%10 == 0 {
			return false
		} else if temp%(number%10) != 0 {
			return false
		}
		number /= 10
	}
	return true
}

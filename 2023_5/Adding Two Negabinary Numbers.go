package study2023_5

import "fmt"

func addNegabinary(arr1 []int, arr2 []int) []int {
	// new arr to store result, len = max(len(arr1), len(arr2)) + 2
	var resLen int
	len1 := len(arr1) - 1
	len2 := len(arr2) - 1
	if len1 > len2 {
		resLen = len1
	} else {
		resLen = len2
	}
	res := make([]int, resLen+3)
	carry := 0
	i := 0
	for {
		if len1 < 0 && len2 < 0 && carry == 0 {
			break
		} else if len1 < 0 && len2 < 0 {
			res[i] = carry
		} else if len1 < 0 {
			res[i] = arr2[len2] + carry
		} else if len2 < 0 {
			res[i] = arr1[len1] + carry
		} else {
			res[i] = arr1[len1] + arr2[len2] + carry
		}
		if res[i] == 0 {
			carry = 0
		} else if res[i] == 1 {
			carry = 0
		} else if res[i] == 2 {
			carry = -1
			res[i] = 0
		} else if res[i] == 3 {
			carry = -1
			res[i] = 1
		} else if res[i] == -1 {
			carry = 1
			res[i] = 1
		}
		i++
		len1--
		len2--
	}

	// resverse res
	for i := 0; i < len(res)/2; i++ {
		res[i], res[len(res)-1-i] = res[len(res)-1-i], res[i]
	}

	// remove leading zero
	for i := 0; i < len(res); i++ {
		if res[i] != 0 {
			return res[i:]
		}
	}

	return []int{0}
}

func Test() {
	fmt.Println(addNegabinary([]int{1, 1, 1, 1, 1}, []int{1, 0, 1}))
	fmt.Println(addNegabinary([]int{1}, []int{1}))
	fmt.Println(addNegabinary([]int{0}, []int{0}))
	fmt.Println(addNegabinary([]int{0}, []int{1}))
}

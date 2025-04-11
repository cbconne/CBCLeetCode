package go_2025_04

import "fmt"

func countSymmetricIntegers(low int, high int) int {
	count := 0
	for i := low; i <= high; i++ {
		// int to string
		str := fmt.Sprintf("%d", i)
		if len(str)%2 != 0 {
			continue
		}
		res := 0
		for i, j := 0, len(str)-1; i < j; i, j = i+1, j-1 {
			// char to int
			res += int(str[i]-'0') - int(str[j]-'0')
		}
		if res == 0 {
			count++
		}
	}
	return count
}

func TestCountSymmetricIntegers() {
	low := 1
	high := 100
	fmt.Println(countSymmetricIntegers(low, high))
	low = 1200
	high = 1230
	fmt.Println(countSymmetricIntegers(low, high))
}

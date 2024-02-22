package Interview_150

import "fmt"

func intToRoman(num int) string {
	// 1. 定义罗马数字字符集
	romanMap := map[int]string{
		1:    "I",
		4:    "IV",
		5:    "V",
		9:    "IX",
		10:   "X",
		40:   "XL",
		50:   "L",
		90:   "XC",
		100:  "C",
		400:  "CD",
		500:  "D",
		900:  "CM",
		1000: "M",
	}
	// 2. 定义结果字符串
	res := ""
	// 3. 遍历罗马数字字符集
	for _, v := range []int{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1} {
		// 4. 计算当前字符的个数
		count := num / v
		// 5. 拼接结果字符串
		for i := 0; i < count; i++ {
			res += romanMap[v]
		}
		// 6. 更新num
		num %= v
	}
	// 7. 返回结果字符串
	return res
}

func IntegerToRomanTest() {
	fmt.Println(intToRoman(3))    // "III
	fmt.Println(intToRoman(4))    // "IV"
	fmt.Println(intToRoman(9))    // "IX"
	fmt.Println(intToRoman(58))   // "LV
	fmt.Println(intToRoman(1994)) // "
}

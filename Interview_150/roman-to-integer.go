package Interview_150

import "fmt"

func romanToInt(s string) int {
	// 创建一个map，存储罗马数字和对应的整数
	romanMap := map[byte]int{
		'I': 1,
		'V': 5,
		'X': 10,
		'L': 50,
		'C': 100,
		'D': 500,
		'M': 1000,
	}
	// 初始化结果
	res := 0
	// 反向遍历字符串
	for i := len(s) - 1; i >= 0; i-- {
		// 若当前位置的值小于前一个位置的值
		if i < len(s)-1 && romanMap[s[i]] < romanMap[s[i+1]] {
			// 结果减去当前位置的值
			res -= romanMap[s[i]]
		} else {
			// 结果加上当前位置的值
			res += romanMap[s[i]]
		}
	}
	return res
}

func RomanToIntTest() {
	fmt.Printf("romanToInt(\"III\"): %v\n", romanToInt("III"))
	fmt.Printf("romanToInt(\"IV\"): %v\n", romanToInt("IV"))
	fmt.Printf("romanToInt(\"IX\"): %v\n", romanToInt("IX"))
	fmt.Printf("romanToInt(\"LVIII\"): %v\n", romanToInt("LVIII"))
	fmt.Printf("romanToInt(\"MCMXCIV\"): %v\n", romanToInt("MCMXCIV"))
}

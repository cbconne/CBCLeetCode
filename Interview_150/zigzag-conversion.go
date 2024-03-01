package Interview_150

import "fmt"

func convert(s string, numRows int) string {
	if numRows == 1 {
		return s
	}
	var res string
	t := 2*numRows - 2
	for i := 0; i < numRows; i++ {
		for j := i; j < len(s); j += t {
			res += string(s[j])
			if i > 0 && i < numRows-1 {
				k := j + t - 2*i
				if k < len(s) {
					res += string(s[k])
				}
			}
		}
	}
	return res
}

func ConvertTest() {
	s := "PAYPALISHIRING"
	numRows := 3
	fmt.Println(convert(s, numRows)) //PAHNAPLSIIGYIR
	numRows = 4
	fmt.Println(convert(s, numRows)) //PINALSIGYAHRPI
	s = "A"
	numRows = 1
	fmt.Println(convert(s, numRows)) //A
}

package study2022_3

import "strconv"

func CalPoints(ops []string) int {
	temp := make([]string, 0, len(ops))
	res := 0
	for _, op := range ops {
		switch op {
		case "C":
			i, _ := strconv.Atoi(temp[len(temp)-1])
			temp = temp[0 : len(temp)-1]
			res -= i
		case "D":
			i, _ := strconv.Atoi(temp[len(temp)-1])
			temp = append(temp, strconv.Itoa(i*2))
			res += 2 * i
		case "+":
			i, _ := strconv.Atoi(temp[len(temp)-1])
			j, _ := strconv.Atoi(temp[len(temp)-2])
			temp = append(temp, strconv.Itoa(i+j))
			res += i + j
		default:
			i, _ := strconv.Atoi(op)
			res += i
			temp = append(temp, op)
		}
	}
	return res
}

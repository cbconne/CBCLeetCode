package study2022_4

func ShortestToChar(s string, c byte) []int {
	last_c_left := -1
	last_c_right := -1
	res := make([]int, len(s))
	for left_i, left_char := range s {
		if byte(left_char) == c {
			last_c_left = left_i
			res[left_i] = 0
		} else {
			if last_c_left == -1 {
				res[left_i] = -1
			} else {
				res[left_i] = left_i - last_c_left
			}
		}
	}

	for right_i := len(s) - 1; right_i >= 0; right_i-- {
		if byte(s[right_i]) == c {
			last_c_right = right_i
			res[right_i] = 0
		} else {
			if last_c_right != -1 {
				res[right_i] = min_2022_4_19(res[right_i], last_c_right-right_i)
			}
		}
	}
	return res
}

func min_2022_4_19(a, b int) int {
	if a == -1 {
		return b
	} else if b == -1 {
		return a
	}
	if a < b {
		return a
	}
	return b
}

package study2022_3

func ImageSmoother(img [][]int) [][]int {
	if len(img) == 0 || len(img[0]) == 0 {
		return nil
	}
	res := make([][]int, len(img))
	for i := range img {
		res[i] = make([]int, len(img[i]))
		for j := range img[i] {
			res[i][j] = average(img, i, j)
		}
	}
	return res
}

func average(img [][]int, i int, j int) int {
	sum := 0
	count := 0
	for x := i - 1; x <= i+1; x++ {
		for y := j - 1; y <= j+1; y++ {
			if x >= 0 && x < len(img) && y >= 0 && y < len(img[x]) {
				sum += img[x][y]
				count++
			}
		}
	}
	return sum / count
}

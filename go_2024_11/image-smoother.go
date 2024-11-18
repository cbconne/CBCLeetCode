package go_2024_11

import "fmt"

func imageSmoother(img [][]int) [][]int {

	res := make([][]int, len(img))
	for i := range img {
		res[i] = make([]int, len(img[i]))
	}
	for i := range img {
		for j := range img[i] {
			res[i][j] = average(img, i, j)
		}
	}
	return res
}

func average(img [][]int, i, j int) int {
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

func ImageSmootherTest() {
	img := [][]int{
		{1, 1, 1},
		{1, 0, 1},
		{1, 1, 1},
	}
	res := imageSmoother(img)
	fmt.Print(res)

	img = [][]int{
		{100, 200, 100},
		{200, 50, 200},
		{100, 200, 100},
	}
	res = imageSmoother(img)
	fmt.Print(res)
}

package Interview_150

import "fmt"

func rotate(matrix [][]int) {
	// 先水平翻转，再对角线翻转，即可实现顺时针 90 度旋转
	// 水平翻转
	for i := 0; i < len(matrix)/2; i++ {
		for j := 0; j < len(matrix); j++ {
			matrix[i][j], matrix[len(matrix)-1-i][j] = matrix[len(matrix)-1-i][j], matrix[i][j]
		}
	}

	// 对角线翻转
	for i := 0; i < len(matrix); i++ {
		for j := 0; j < i; j++ {
			matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
		}
	}
}

func RotateTest() {
	matrix := [][]int{
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	}
	rotate(matrix)
	for i := 0; i < len(matrix); i++ {
		for j := 0; j < len(matrix[i]); j++ {
			fmt.Print(matrix[i][j], " ")
		}
		fmt.Println()
	}

	matrix = [][]int{
		{5, 1, 9, 11},
		{2, 4, 8, 10},
		{13, 3, 6, 7},
		{15, 14, 12, 16},
	}
	rotate(matrix)
	for i := 0; i < len(matrix); i++ {
		for j := 0; j < len(matrix[i]); j++ {
			fmt.Print(matrix[i][j], " ")
		}
		fmt.Println()
	}
}

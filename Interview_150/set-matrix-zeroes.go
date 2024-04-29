package Interview_150

import "fmt"

func setZeroes(matrix [][]int) {
	// 待修改的行（set）
	rows := make(map[int]bool)
	// 待修改的列（切片）
	cols := make(map[int]bool)
	// 遍历矩阵，记录待修改的行和列

	for i := 0; i < len(matrix); i++ {
		is_zero := false
		for j := 0; j < len(matrix[i]); j++ {
			if matrix[i][j] == 0 {
				is_zero = true
				cols[j] = true
			}
		}
		if is_zero {
			rows[i] = true
		}
	}
	// 遍历矩阵，修改
	for i := 0; i < len(matrix); i++ {
		for j := 0; j < len(matrix[i]); j++ {
			if rows[i] || cols[j] {
				matrix[i][j] = 0
			}
		}
	}

}

func SetZeroesTest() {
	matrix := [][]int{
		{1, 1, 1},
		{1, 0, 1},
		{1, 1, 1},
	}
	setZeroes(matrix)
	for _, row := range matrix {
		for _, col := range row {
			fmt.Print(col, " ")
		}
		fmt.Println()
	}

	matrix = [][]int{
		{0, 1, 2, 0},
		{3, 4, 5, 2},
		{1, 3, 1, 5},
	}
	setZeroes(matrix)
	for _, row := range matrix {
		for _, col := range row {
			fmt.Print(col, " ")
		}
		fmt.Println()
	}
}

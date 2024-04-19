package Interview_150

import "fmt"

// isValidSudoku 验证一个给定的数独盘面是否有效
// 参数：
//
//	board [][]byte - 一个二维字节数组，表示数独盘面
//
// 返回值：
//
//	bool - 如果盘面有效，则返回true；否则返回false
func isValidSudoku(board [][]byte) bool {
	// 遍历每一行
	for i := 0; i < len(board); i++ {
		// 创建一个map用于记录当前行的数字
		row := make(map[byte]bool)
		// 遍历每一列
		for j := 0; j < len(board[i]); j++ {
			// 如果当前位置不是空格且已经出现过相同数字，则返回false
			if board[i][j] != '.' && row[board[i][j]] {
				return false
			}
			// 将当前位置的数字记录到当前行的map中
			row[board[i][j]] = true

			// 创建一个map用于记录当前列的数字（在内部循环中创建，因为每列都需要一个新的map）
			col := make(map[byte]bool)
			// 检查当前列的数字
			for k := 0; k < len(board); k++ {
				// 如果当前位置不是空格且已经出现过相同数字，则返回false
				if board[k][j] != '.' && col[board[k][j]] {
					return false
				}
				// 将当前位置的数字记录到当前列的map中
				col[board[k][j]] = true
			}

			// 计算当前3x3格子的起始索引
			startRow := i / 3 * 3
			startCol := j / 3 * 3
			// 创建一个新的map用于记录当前3x3格子的数字
			box := make(map[byte]bool)
			// 检查当前3x3格子的数字
			for m := startRow; m < startRow+3; m++ {
				for n := startCol; n < startCol+3; n++ {
					// 如果当前位置不是空格且已经出现过相同数字，则返回false
					if board[m][n] != '.' && box[board[m][n]] {
						return false
					}
					// 将当前位置的数字记录到当前3x3格子的map中
					box[board[m][n]] = true
				}
			}
		}
	}
	// 如果所有行、列和3x3格子都满足要求，则返回true
	return true
}

func IsValidSudokuTest() {
	board := [][]byte{
		{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
		{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
		{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
		{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
		{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
		{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
		{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
		{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
		{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
	}
	fmt.Println(isValidSudoku(board))
}

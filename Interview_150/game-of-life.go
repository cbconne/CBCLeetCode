package Interview_150

import "fmt"

func gameOfLife(board [][]int) {

	/*
	 * gameOfLife函数实现了康威生命游戏，这是一个零玩家的推演游戏。
	 * 参数board是一个二维整数数组，代表游戏的初始状态，每个元素为1代表一个活着的细胞，为0代表一个死亡的细胞。
	 * 该函数会根据初始状态推算出下一个时刻的细胞状态，但不直接返回结果，而是修改原始的board数组。
	 */

	// 遍历每个细胞，计算其周围存活细胞的数量，得出细胞下一时刻的状态，并将结果存储在原地的高位
	for i := 0; i < len(board); i++ {
		for j := 0; j < len(board[0]); j++ {
			// 计算细胞周围存活细胞的数量
			count := 0
			for x := -1; x <= 1; x++ {
				for y := -1; y <= 1; y++ {
					if x == 0 && y == 0 {
						continue
					}
					if i+x >= 0 && i+x < len(board) && j+y >= 0 && j+y < len(board[0]) {
						// 获取细胞周围存活细胞的数量，由于高位存储了细胞下一时刻的状态，所以需要 & 1 与低位进行与运算，本质是与 01 进行位与，排除高位
						count += board[i+x][j+y] & 1
						if count > 3 {
							// 如果细胞周围存活细胞的数量超过3个，则该细胞死亡，不用再计算其余的细胞
							// 高位存储下一细胞状态，此处为 0，表示该细胞死亡
							board[i][j] = board[i][j] & 1
						}
					}
				}
			}
			if count == 3 {
				// 如果细胞周围存活细胞的数量为3，则该细胞不论死活，下一状态均为存活
				// 高位存储下一细胞状态，此处为 1，表示该细胞复活，原地数字与 10 进行位或，将高位置为 1，低位不变
				board[i][j] = board[i][j] | 2
			} else if count == 2 {
				// 如果细胞周围存活细胞的数量为2，则该细胞下一状态与当前状态相同，原地数字将高位置成低位
				temp := board[i][j] & 1
				temp = temp << 1
				board[i][j] = board[i][j] | temp
			}
			// 如果细胞周围存活细胞的数量不为3或2，说明少于2或超过3，则该细胞死亡，无须处理
		}
	}

	// 遍历每个细胞，将原地数字右移一位
	for i := 0; i < len(board); i++ {
		for j := 0; j < len(board[0]); j++ {
			board[i][j] = board[i][j] >> 1
		}
	}
}

func GameOfLifeTest() {
	board := [][]int{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}}
	gameOfLife(board)
	fmt.Println(board)

}

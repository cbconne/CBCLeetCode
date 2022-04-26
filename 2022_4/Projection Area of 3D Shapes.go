package study2022_4

func ProjectionArea(grid [][]int) int {
	return xyShade(grid) + xzShade(grid) + yzShade(grid)
}

func xyShade(grid [][]int) int {
	res := 0
	for i := range grid {
		for j := range grid[i] {
			if grid[i][j] != 0 {
				res++
			}
		}
	}
	return res
}

func xzShade(grid [][]int) int {
	res := 0
	for i := range grid {
		xMax := 0
		for j := range grid[i] {
			if grid[i][j] > xMax {
				xMax = grid[i][j]
			}
		}
		res += xMax
	}
	return res
}

func yzShade(grid [][]int) int {
	res := 0
	for j := range grid[0] {
		yMax := 0
		for i := range grid {
			if grid[i][j] > yMax {
				yMax = grid[i][j]
			}
		}
		res += yMax
	}
	return res
}

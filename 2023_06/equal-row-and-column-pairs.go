package study2023_06

import "strconv"

func equalPairs(grid [][]int) int {
	res := 0
	hashmap := make(map[string]int, len(grid))
	// 循环遍历每一行
	for _, row := range grid {
		hash(row, hashmap)
	}
	// 循环遍历每一列
	for i := 0; i < len(grid[0]); i++ {
		col := make([]int, len(grid))
		for j := 0; j < len(grid); j++ {
			col[j] = grid[j][i]
		}
		if _, ok := hashmap[list2str(col)]; ok {
			res += hashmap[list2str(col)]
		}
	}
	return res
}

func hash(list []int, hashmap map[string]int) {
	str := ""
	for _, v := range list {
		str += "," + strconv.Itoa(v)
	}
	// 对应map中的value值，如果存在则+1，不存在则赋值为1
	hashmap[str]++
}

func list2str(list []int) string {
	str := ""
	for _, v := range list {
		str += "," + strconv.Itoa(v)
	}
	return str
}

func EqualPairsTest() {
	// 输入：grid = [[3,2,1],[1,7,6],[2,7,7]]
	// grid := [][]int{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}
	// 输入：grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
	// grid := [][]int{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}
	// [[11,1],[1,11]]
	grid := [][]int{{11, 1}, {1, 11}}
	println(equalPairs(grid))
}

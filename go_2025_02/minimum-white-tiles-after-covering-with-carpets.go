package go_2025_02

func minimumWhiteTiles(floor string, numCarpets int, carpetLen int) int {
	// 用于记忆递归结果的缓存
	i := numCarpets
	j := len(floor) - 1
	memo := make([][]int, i+1)
	for k := range memo {
		memo[k] = make([]int, j+1)
		for l := range memo[k] {
			memo[k][l] = -1
		}
	}

	return dfs(numCarpets, len(floor)-1, floor, carpetLen, memo)
}

func dfs(i int, j int, floor string, carpetLen int, memo [][]int) int {
	if j < carpetLen*i {
		return 0
	}
	if memo[i][j] != -1 {
		return memo[i][j]
	}
	if i == 0 {
		// 此时没有剩余地毯
		memo[i][j] = dfs(i, j-1, floor, carpetLen, memo) + int(floor[j]-'0')
		return memo[i][j]
	}
	memo[i][j] = min(dfs(i, j-1, floor, carpetLen, memo)+int(floor[j]-'0'), dfs(i-1, j-carpetLen, floor, carpetLen, memo))
	return memo[i][j]
}

func TestMinimumWhiteTiles() {
	floor := "10110101"
	numCarpets := 2
	carpetLen := 2
	res := minimumWhiteTiles(floor, numCarpets, carpetLen)
	println(res)

	floor = "11111"
	numCarpets = 2
	carpetLen = 3
	res = minimumWhiteTiles(floor, numCarpets, carpetLen)
	println(res)

	floor = "01111111110111101111001111110111111111101101101111111110111011110111111101101110011110111011001"
	numCarpets = 72
	carpetLen = 1
	res = minimumWhiteTiles(floor, numCarpets, carpetLen)
	println(res)
}

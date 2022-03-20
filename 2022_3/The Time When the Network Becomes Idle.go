package study2022_3

func NetworkBecomesIdle(edges [][]int, patience []int) int {
	g := make([][]int, len(patience))
	for _, e := range edges {
		g[e[0]] = append(g[e[0]], e[1])
		g[e[1]] = append(g[e[1]], e[0])
	}

	ans := 0

	vis := make([]bool, len(patience))
	vis[0] = true

	q := []int{0}

	for dist := 1; q != nil; dist++ {
		tmp := q
		q = nil
		for _, node := range tmp {
			for _, gnode := range g[node] {
				if vis[gnode] {
					continue
				}
				vis[gnode] = true
				q = append(q, gnode)
				time := (2*dist-1)/patience[gnode]*patience[gnode] + 2*dist + 1
				if ans < time {
					ans = time
				}
			}
		}
	}
	return ans
}

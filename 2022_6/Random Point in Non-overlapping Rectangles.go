package study2022_6

import "math/rand"

type Solution_20220609 struct {
	rects [][]int
}

func Constructor_20220609(rects [][]int) Solution_20220609 {
	return Solution_20220609{rects}
}

func (this *Solution_20220609) Pick() []int {
	list := []int{}
	sum := 0
	for i := range this.rects {
		list = append(list, getPointNum(this.rects[i]))
		sum += getPointNum(this.rects[i])
	}
	resi := rand.Intn(sum)
	for i, num := range list {
		if resi < num {
			return getRandomPoint(this.rects[i])
		}
		resi -= num
	}
	return []int{}
}

func getRandomPoint(rect []int) []int {
	x := rand.Intn(rect[2]-rect[0]) + rect[0]
	y := rand.Intn(rect[3]-rect[1]) + rect[1]
	return []int{x, y}
}

func getPointNum(rect []int) int {
	return (rect[2] - rect[0]) * (rect[3] - rect[1])
}

/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(rects);
 * param_1 := obj.Pick();
 */

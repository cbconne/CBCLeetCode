package study2022_6

import "math/rand"

type Solution_0607 struct {
	x_center, y_center, radius float64
}

func Constructor_20220607(radius float64, x_center float64, y_center float64) Solution_0607 {
	return Solution_0607{x_center, y_center, radius}
}

func (this *Solution_0607) RandPoint() []float64 {
	for {
		x := rand.Float64()*2 - 1
		y := rand.Float64()*2 - 1
		if (x*x + y*y) <= 1 {
			return []float64{x*this.radius + this.x_center, y*this.radius + this.y_center}
		}
	}
}

/**
 * Your Solution object will be instantiated and called as such:
 * obj := Constructor(radius, x_center, y_center);
 * param_1 := obj.RandPoint();
 */

package main

import (
	"fmt"

	study2022_3 "./2022_3"
)

func main() {
	img := [][]int{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}}
	fmt.Printf("study2022_3.ImageSmoother(img): %v\n", study2022_3.ImageSmoother(img))
}

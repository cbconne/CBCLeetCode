package main

import (
	"fmt"

	study2022_4 "./2022_4"
)

func main() {
	accounts := [][]int{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}
	fmt.Printf("study2022_4.MaximumWealth(accounts): %v\n", study2022_4.MaximumWealth(accounts))
}

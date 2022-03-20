package main

import (
	study2022_3 "./2022_3"
)

func main() {
	// Edges := [][]int{{0, 1}, {1, 2}}
	// patience := []int{0, 2, 1}
	// println(study2022_3.NetworkBecomesIdle(edges, patience))
	// edges2 := [][]int{{0, 1}, {0, 2}, {1, 2}}
	// patience2 := []int{0, 10, 10}
	// println(study2022_3.NetworkBecomesIdle(edges2, patience2))
	errEdge := [][]int{{3, 8}, {4, 13}, {0, 7}, {0, 4}, {1, 8}, {14, 1}, {7, 2}, {13, 10}, {9, 11}, {12, 14}, {0, 6}, {2, 12}, {11, 5}, {6, 9}, {10, 3}}
	errPatience := []int{0, 3, 2, 1, 5, 1, 5, 5, 3, 1, 2, 2, 2, 2, 1}
	println(study2022_3.NetworkBecomesIdle(errEdge, errPatience))
}

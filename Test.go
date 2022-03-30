package main

import (
	"fmt"

	study2022_3 "./2022_3"
)

func main() {
	k := 1
	arrival := []int{1}
	load := []int{1}
	fmt.Printf("study2022_3.BusiestServers(k, arrival, load): %v\n", study2022_3.BusiestServers(k, arrival, load))
}

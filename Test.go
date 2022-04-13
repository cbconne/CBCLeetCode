package main

import (
	"fmt"

	study2022_4 "./2022_4"
)

func main() {
	r := study2022_4.Constructor()
	r.Insert(0)
	r.Insert(1)
	r.Remove(0)
	r.Insert(2)
	r.Remove(1)
	fmt.Printf("r.GetRandom(): %v\n", r.GetRandom())
}

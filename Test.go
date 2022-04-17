package main

import (
	"fmt"

	study2022_4 "./2022_4"
)

func main() {
	paragraph := "Bob hit a ball, the hit BALL flew far after it was hit."
	banned := []string{"hit"}
	fmt.Printf("study2022_4.MostCommonWord(paragraph, banned): %v\n", study2022_4.MostCommonWord(paragraph, banned))
}

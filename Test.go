package main

import (
	"fmt"

	study2022_4 "./2022_4"
)

func main() {
	letters := []byte{'c', 'f', 'j'}
	target := byte('d')
	fmt.Printf("study2022_4.NextGreatestLetter(letters, target): %c\n", study2022_4.NextGreatestLetter(letters, target))
}

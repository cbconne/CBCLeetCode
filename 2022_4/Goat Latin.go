package study2022_4

import "strings"

func ToGoatLatin(sentence string) string {
	words := strings.Split(sentence, " ")
	resWords := make([]string, len(words))
	for i, word := range words {
		resWords[i] = toGoatWord(word) + strings.Repeat("a", i+1)
	}
	res := ""
	for _, resWord := range resWords {
		res += resWord + " "
	}
	return res[:len(res)-1]

}

func toGoatWord(word string) string {
	vowels := map[byte]bool{'a': true, 'e': true, 'i': true, 'o': true, 'u': true, 'A': true, 'E': true, 'I': true, 'O': true, 'U': true}
	if _, ok := vowels[word[0]]; ok {
		return word + "ma"
	} else {
		return word[1:] + word[0:1] + "ma"
	}
}

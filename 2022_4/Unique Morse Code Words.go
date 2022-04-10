package study2022_4

import "strings"

func UniqueMorseRepresentations(words []string) int {
	morse := []string{".-", "-...", "-.-.", "-..", ".", "..-.",
		"--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
		".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."}
	hashMap := make(map[string]bool)
	for _, word := range words {
		res := strings.Builder{}
		for _, c := range word {
			res.WriteString(morse[c-'a'])
		}
		hashMap[res.String()] = true
	}
	return len(hashMap)
}

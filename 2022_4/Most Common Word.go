package study2022_4

import (
	"regexp"
	"strings"
)

func MostCommonWord(paragraph string, banned []string) string {
	banMap := make(map[string]bool)
	for _, b := range banned {
		banMap[b] = true
	}
	wordCnt := make(map[string]int)
	r, _ := regexp.Compile(`[!?',;.]?\s|[!?',;.]`)
	words := r.Split(paragraph, -1)
	for _, word := range words {
		if _, ok := banMap[strings.ToLower(word)]; ok || word == "" {
			continue
		}
		if _, ok := wordCnt[strings.ToLower(word)]; ok {
			wordCnt[strings.ToLower(word)]++
		} else {
			wordCnt[strings.ToLower(word)] = 1
		}
	}

	res := ""
	max := 0
	for word, cnt := range wordCnt {
		if cnt > max {
			res = word
			max = cnt
		}
	}
	return res
}

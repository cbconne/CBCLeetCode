package study2023_06

func vowelStrings(words []string, queries [][]int) []int {
	counts := make([]int, len(words)+1)
	counts[0] = 0
	cnt := 0
	for i, word := range words {
		if isVowelWord(word) {
			cnt++
		}
		counts[i+1] = cnt
	}
	res := make([]int, 0)
	for _, query := range queries {
		res = append(res, counts[query[1]+1]-counts[query[0]])
	}
	return res
}

func isVowelWord(word string) bool {
	vowelList := []string{"a", "e", "i", "o", "u"}
	if contains(vowelList, string(word[0])) &&
		contains(vowelList, string(word[len(word)-1])) {
		return true
	}
	return false
}

func contains(list []string, str string) bool {
	for _, item := range list {
		if item == str {
			return true
		}
	}
	return false
}

func VowelStringsTest() {
	// words := []string{"aba", "bcb", "ece", "aa", "e"}
	// queries = [[0,2],[1,4],[1,1]]
	// queries := [][]int{{0, 2}, {1, 4}, {1, 1}}
	//words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
	words := []string{"a", "e", "i"}
	queries := [][]int{{0, 2}, {0, 1}, {2, 2}}
	res := vowelStrings(words, queries)
	// print res
	for _, item := range res {
		print(item, " ")
	}
}

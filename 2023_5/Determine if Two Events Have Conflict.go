package study2023_5

func haveConflict(event1 []string, event2 []string) bool {
	if event1[0] >= event2[0] && event1[0] <= event2[1] {
		return true
	}
	if event2[0] >= event1[0] && event2[0] <= event1[1] {
		return true
	}
	return false
}

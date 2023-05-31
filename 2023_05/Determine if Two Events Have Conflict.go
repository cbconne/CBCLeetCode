package study2023_05

func HaveConflict(event1 []string, event2 []string) bool {
	if event1[0] >= event2[0] && event1[0] <= event2[1] {
		return true
	}
	if event2[0] >= event1[0] && event2[0] <= event1[1] {
		return true
	}
	return false
}

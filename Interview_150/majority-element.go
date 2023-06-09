package Interview_150

func majorityElement(nums []int) int {
	nums_map := make(map[int]int)
	for _, num := range nums {
		nums_map[num]++
		if nums_map[num] > len(nums)/2 {
			return num
		}
	}
	return -1
}

func MajorityElementTest() {
	nums := []int{3, 2, 3}
	println(majorityElement(nums))
}

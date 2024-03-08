package Interview_150

import "fmt"

func maxArea(height []int) int {
	// 双指针
	left, right := 0, len(height)-1
	maxArea := 0
	for left < right {
		var area int
		if height[left] < height[right] {
			area = height[left] * (right - left)
			left++
		} else {
			area = height[right] * (right - left)
			right--
		}
		if area > maxArea {
			maxArea = area
		}
	}
	return maxArea
}

func MaxAreaTest() {

	height := []int{1, 8, 6, 2, 5, 4, 8, 3, 7}
	fmt.Println(maxArea(height))
}

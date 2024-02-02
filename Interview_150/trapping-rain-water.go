package Interview_150

import "fmt"

func trap(height []int) int {
	left := 0
	right := len(height) - 1
	leftMaxHeight := height[0]
	rightMaxHeight := height[len(height)-1]
	res := 0
	for left < right {
		// 若左指针指向的高度小于右指针指向的高度
		if height[left] < height[right] {
			// 此时，左指针右侧的最高高度一定大于等于右指针右侧的最高高度
			// 计算当前位置的雨水量
			// 两个最高高度中较小的一个减去当前位置的高度
			if leftMaxHeight < rightMaxHeight {
				res += leftMaxHeight - height[left]
			} else {
				res += rightMaxHeight - height[left]
			}
			left++
			// 若左指针指向的高度大于左边最高的高度
			if height[left] > leftMaxHeight {
				// 更新左边最高的高度
				leftMaxHeight = height[left]
			}
		} else {
			if rightMaxHeight < leftMaxHeight {
				res += rightMaxHeight - height[right]
			} else {
				res += leftMaxHeight - height[right]
			}
			right--
			if height[right] > rightMaxHeight {
				rightMaxHeight = height[right]
			}
		}

	}
	return res
}

func TrapTest() {
	fmt.Printf("trap([]int{4,2,0,3,2,5}): %v\n", trap([]int{4, 2, 0, 3, 2, 5}))
}

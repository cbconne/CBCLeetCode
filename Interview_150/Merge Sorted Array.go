package Interview_150

func merge(nums1 []int, m int, nums2 []int, n int) {
	// 创建三个指针，分别指向 nums1 的有效元素末尾，nums2 的末尾，和 nums1 的末尾
	p1 := m - 1
	p2 := n - 1
	p := m + n - 1

	// 从后向前遍历，直至 p 指针到达 nums1 的头部
	for p >= 0 {
		// 若 p1 已经到达头部，说明 nums1 的有效元素已经全部放入 nums1 中
		// 剩下的 nums2 全部放入 nums1 中
		if p1 < 0 {
			nums1[p] = nums2[p2]
			p2--
		} else

		// 若 p2 已经到达头部，说明 nums2 的有效元素已经全部放入 nums1 中
		// 剩下的 nums1 全部放入 nums1 中
		if p2 < 0 {
			nums1[p] = nums1[p1]
			p1--
		} else

		// 若 p1 和 p2 都没有到达头部，比较两者的大小，将较大的元素放入 nums1 的末尾
		if p1 >= 0 && p2 >= 0 {
			if nums1[p1] > nums2[p2] {
				nums1[p] = nums1[p1]
				p1--
			} else {
				nums1[p] = nums2[p2]
				p2--
			}
		}
		p--
	}
}

func MergeTest() {
	// nums1 := []int{1, 2, 3, 0, 0, 0}
	// nums2 := []int{2, 5, 6}
	nums1 := []int{0}
	nums2 := []int{1}

	// merge(nums1, 3, nums2, 3)
	merge(nums1, 0, nums2, 1)
	for _, num := range nums1 {
		// 不换行打印
		print(num, " ")
	}
}

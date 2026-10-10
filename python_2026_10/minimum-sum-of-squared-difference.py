from typing import List


class Solution:
    def minSumSquareDiff(
        self, nums1: List[int], nums2: List[int], k1: int, k2: int
    ) -> int:
        """
        >>> solution = Solution()
        >>> solution.minSumSquareDiff([1,2,3,4], [2,10,20,19], 0, 0)
        579
        >>> solution.minSumSquareDiff([1,4,10,12], [5,8,6,9], 1, 1)
        43
        >>> solution.minSumSquareDiff([10,10,10,11,5], [1,0,6,6,1], 11, 27)
        0
        """
        # 计算 diff 数组
        diffs = [abs(a - b) for a, b in zip(nums1, nums2)]
        k = k1 + k2
        if k == 0:
            return sum(diff**2 for diff in diffs)
        # 使用二分法计算是否能将 diffs 里所有元素减小到某个阈值
        left, right = 0, max(diffs)
        while left < right:
            mid = (left + right) // 2
            total = sum(max(0, diff - mid) for diff in diffs)
            if total <= k:
                right = mid
            else:
                left = mid + 1
        # 将所有 diff 减小到 left，并统计剩余可用的 k
        for i, diff in enumerate(diffs):
            if diff > left:
                k -= diff - left
                diffs[i] = left
        # 如果还有剩余的 k，且 left 不为 0 则继续减小，直到 k 用完
        # 最终结果还能小 k 个 left ** 2 - (left-1) ** 2 = 2*left-1
        return sum(diff**2 for diff in diffs) - (k * (2 * left - 1) if left > 0 else 0)


if __name__ == "__main__":
    import doctest

    doctest.testmod(verbose=True)

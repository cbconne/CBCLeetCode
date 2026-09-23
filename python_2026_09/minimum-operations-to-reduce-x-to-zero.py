class Solution:
    def minOperations(self, nums: list[int], x: int) -> int:
        """
        划窗方法实现

        >>> solution = Solution()
        >>> solution.minOperations([1, 1, 4, 2, 3], 5)
        2
        >>> solution.minOperations([5, 6, 7, 8, 9], 4)
        -1
        >>> solution.minOperations([3, 2, 20, 1, 1, 3], 10)
        5
        >>> solution.minOperations([8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309], 134365)
        16
        >>> solution.minOperations([500,1,4,2,3],500)
        1
        """
        left = 0
        right = 0
        # 计算数组前缀和
        prefix = [0] * (len(nums) + 1)
        for i, num in enumerate(nums):
            prefix[i + 1] = prefix[i] + num
        # prefix[i] 表示前 i 个元素的和，即下标 0、1 ... i-1 的元素之和
        # 目标值即为 prefix[len(nums)] - x
        goal = prefix[len(nums)] - x
        if goal == 0:
            return len(nums)
        ans = -1
        while right < len(nums) and left <= right:
            if prefix[right + 1] - prefix[left] < goal:
                right += 1
            elif prefix[right + 1] - prefix[left] > goal:
                left += 1
                if left > right:
                    right = left
            else:
                ans = max(ans, right - left + 1)
                left += 1
                right += 1

        return -1 if ans == -1 else len(nums) - ans

    def minOperationsOpt(self, nums: list[int], x: int) -> int:
        """
        哈希前缀和方式实现

        >>> solution = Solution()
        >>> solution.minOperationsOpt([1, 1, 4, 2, 3], 5)
        2
        >>> solution.minOperationsOpt([5, 6, 7, 8, 9], 4)
        -1
        >>> solution.minOperationsOpt([3, 2, 20, 1, 1, 3], 10)
        5
        >>> solution.minOperationsOpt([8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309], 134365)
        16
        >>> solution.minOperationsOpt([500,1,4,2,3],500)
        1
        """
        total = sum(nums)
        if total == x:
            return len(nums)
        if total < x:
            return -1

        goal = total - x

        prefix_map = {0: -1}
        prefix = 0
        ans = -1

        for i, num in enumerate(nums):
            prefix += num

            if prefix - goal in prefix_map:
                ans = max(ans, i - prefix_map[prefix - goal])
            if prefix not in prefix_map:
                prefix_map[prefix] = i

        return -1 if ans == -1 else len(nums) - ans


if __name__ == "__main__":
    import doctest

    doctest.testmod(verbose=True)

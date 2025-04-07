from typing import List


class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        # 首先筛选完全不可能的情况
        total = sum(nums)
        # 如果总和是奇数，则肯定不可能
        if total % 2 == 1:
            return False
        target = total // 2
        # 如果最大值大于target，则肯定不可能
        max_num = max(nums)
        if max_num > target:
            return False

        # 创建一个 dp 数组，dp[i,j] 表示前 i 个数字是否可以组成和为 j 的子集
        # i 范围从 0 到 len(nums)
        # j 范围从 0 到 target
        dp = [[False] * (target + 1) for _ in range(len(nums))]
        # 边界条件
        # dp[i,0] 均为 True，不选择任何数字即可
        for i in range(len(nums)):
            dp[i][0] = True
        # dp[0,nums[0]] 为 True，选择第一个数字即可
        dp[0][nums[0]] = True

        # 状态转移方程：
        # dp[i,j] = dp[i-1,j](不选择当前数字，则状态不变)
        # dp[i,j] = dp[i-1,j-nums[i]](选择当前数字，则状态变为 dp[i-1,j-nums[i]]，即上一状态时和为 j-nums[i] 的情况)
        for i in range(len(nums)):
            for j in range(target + 1):
                if j >= nums[i]:
                    dp[i][j] = dp[i - 1][j] or dp[i - 1][j - nums[i]]
                else:
                    dp[i][j] = dp[i - 1][j]

        # for i in range(len(nums)):
        #     for j in range(target + 1):
        #         print(f"{i} {j} {dp[i][j]}".ljust(10), end=",")
        #     print()

        return dp[len(nums) - 1][target]


if __name__ == "__main__":
    solution = Solution()
    # print(solution.canPartition([1, 5, 11, 5]))
    print(solution.canPartition([1, 2, 3, 5]))

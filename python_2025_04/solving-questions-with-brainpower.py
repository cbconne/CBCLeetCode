from typing import List


class Solution:
    def mostPoints(self, questions: List[List[int]]) -> int:
        # 从后向前遍历，记录每个位置（向后）的最大得分
        n = len(questions)
        dp = [0] * (n + 1)
        for i in range(n - 1, -1, -1):
            points, skip = questions[i]
            # 计算当前位置（向后）的最大得分
            # 有两种情况：
            # 1. 跳过当前题目。
            # 该情况下当前题目（向后）的最大得分即为下一题（向后）的最大得分
            # 2. 不跳过当前题目。
            # 该请框下当前题目（向后）的最大得分为当前题目的分数加上跳过后到达题目（向后）的最大得分
            # 这两种情况的最大值即为当前题目（向后）的最大得分
            point_stage_one = dp[i + 1] if i < n - 1 else 0
            point_stage_two = points + dp[i + skip + 1] if i + skip < n - 1 else points
            dp[i] = max(point_stage_one, point_stage_two)
        return dp[0]


if __name__ == "__main__":
    solution = Solution()
    print(solution.mostPoints([[3, 2], [4, 3], [4, 4], [2, 5]]))
    print(solution.mostPoints([[1, 1], [2, 2], [3, 3], [4, 4], [5, 5]]))

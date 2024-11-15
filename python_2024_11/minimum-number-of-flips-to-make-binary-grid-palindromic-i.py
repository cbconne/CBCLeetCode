from typing import List


class Solution:
    def minFlips(self, grid: List[List[int]]) -> int:
        # 定义行翻转次数
        row_flip = 0

        # 定义列翻转次数
        col_flip = 0

        for i in range(max(len(grid), len(grid[0]))):
            # 定义左右指针
            left, right = 0, len(grid[0]) - 1
            # 定义上下指针
            up, down = 0, len(grid) - 1
            while (left <= right and i < len(grid)) or (
                up <= down and i < len(grid[0])
            ):
                # 左右是否相等
                if left <= right and i < len(grid):
                    if grid[i][left] != grid[i][right]:
                        row_flip += 1
                    left += 1
                    right -= 1
                if up <= down and i < len(grid[0]):
                    if grid[up][i] != grid[down][i]:
                        col_flip += 1
                    up += 1
                    down -= 1

        return min(row_flip, col_flip)


if __name__ == "__main__":
    solution = Solution()
    # grid = [[1, 0, 0], [0, 0, 0], [0, 0, 1]]
    # print(solution.minFlips(grid))
    grid = [[0, 0], [1, 0], [1, 1], [1, 0]]
    print(solution.minFlips(grid))

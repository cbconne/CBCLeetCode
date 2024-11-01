from typing import List


class Solution:
    def maxEnergyBoost(self, energyDrinkA: List[int], energyDrinkB: List[int]) -> int:
        # 使用动态规划
        n = len(energyDrinkA)
        # 创建二维数组 res[i][j] 表示在第 i 天喝第 j 种饮料时的最大能量值(0<=i<n, 0<=j<=1)
        res = [[0, 0] for _ in range(n)]
        # 状态转移方程：
        # 第 i 天喝第 j 种饮料有两种情况：
        # 1. 上一次喝的也是第 j 种饮料，此时能量值为 res[i-1][j] + energyDrinkA[i]
        # 2. 上一次喝的不是第 j 种饮料，此时能量值为 res[i-2][1-j] + energyDrinkB[i]
        # 取这两种情况中的较大者作为第 i 天的能量值
        # 初始状态：
        # 第 0 天喝第 0 种饮料，能量值为 energyDrinkA[0]，res[0][0] = energyDrinkA[0]
        # 第 0 天喝第 1 种饮料，能量值为 energyDrinkB[0]，res[0][1] = energyDrinkB[0]
        # 第 1 天喝第 0 种饮料，能量值为 energyDrinkA[1]，res[1][0] = res[0][0] + energyDrinkA[1](因为更换饮料无法获得能量，因此喝同样饮料获得的能量肯定更大)
        # 第 1 天喝第 1 种饮料，能量值为 energyDrinkB[1]，res[1][1] = res[0][1] + energyDrinkB[1]
        res[0][0] = energyDrinkA[0]
        res[0][1] = energyDrinkB[0]
        res[1][0] = res[0][0] + energyDrinkA[1]
        res[1][1] = res[0][1] + energyDrinkB[1]
        for i in range(2, n):
            res[i][0] = max(
                res[i - 1][0] + energyDrinkA[i], res[i - 2][1] + energyDrinkA[i]
            )
            res[i][1] = max(
                res[i - 1][1] + energyDrinkB[i], res[i - 2][0] + energyDrinkB[i]
            )
        return max(res[n - 1][0], res[n - 1][1])


if __name__ == "__main__":
    solution = Solution()
    # print(solution.maxEnergyBoost([1, 3, 1], [3, 1, 1]))
    # print(solution.maxEnergyBoost([4, 1, 1], [1, 1, 3]))
    # print(solution.maxEnergyBoost([3, 3, 3], [3, 4, 6]))
    print(solution.maxEnergyBoost([4, 3, 4, 4, 3, 6, 5, 5], [4, 6, 4, 4, 5, 3, 4, 4]))

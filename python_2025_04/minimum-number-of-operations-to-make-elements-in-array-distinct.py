from typing import List
import math


class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        # new hash table
        hash_table = {}
        for i in range(len(nums) - 1, -1, -1):
            if hash_table.get(nums[i], 0) == 0:
                hash_table[nums[i]] = 1
            else:
                return math.ceil((i + 1) / 3)
        return 0


if __name__ == "__main__":
    solution = Solution()
    # print(solution.minimumOperations([1, 2, 3, 4, 2, 3, 3, 5, 7]))
    # print(solution.minimumOperations([4, 5, 6, 4, 4]))
    # print(solution.minimumOperations([6, 7, 8, 9]))
    print(solution.minimumOperations([5, 5]))

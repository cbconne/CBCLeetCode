from typing import List


class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        hash_map: dict[int, int] = {}
        for num in nums:
            if num not in hash_map:
                hash_map[num] = 1
            else:
                hash_map[num] += 1
        result: list[list[int]] = []
        while hash_map:
            temp: list[int] = []
            for key in list(hash_map.keys()):
                temp.append(key)
                hash_map[key] -= 1
                if hash_map[key] == 0:
                    del hash_map[key]
            result.append(temp)
        return result


if __name__ == "__main__":
    solution = Solution()
    print(solution.findMatrix([1, 3, 4, 1, 2, 3, 1]))

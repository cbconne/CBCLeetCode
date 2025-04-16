from typing import List


class Solution:
    def countGood(self, nums: List[int], k: int) -> int:
        # 滑动窗口
        left, right = 0, 0
        hash_map = {}
        hash_map[nums[0]] = 1
        pair = 0
        count = 0
        while right < len(nums):
            if pair >= k:
                count += len(nums) - right
                hash_map[nums[left]] -= 1
                pair -= hash_map[nums[left]]
                left += 1
            else:
                right += 1
                if right >= len(nums):
                    break
                if nums[right] not in hash_map:
                    hash_map[nums[right]] = 1
                else:
                    pair += hash_map[nums[right]]
                    hash_map[nums[right]] += 1
        return count


if __name__ == "__main__":
    solution = Solution()
    print(solution.countGood([1, 1, 1, 1, 1], 10))
    print(solution.countGood([3, 1, 4, 3, 2, 2, 4], 2))

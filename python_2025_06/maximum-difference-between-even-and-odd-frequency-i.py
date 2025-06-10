class Solution:
    def maxDifference(self, s: str) -> int:
        # 遍历字符串，存储字符哈希表
        hashmap = {}
        for i in s:
            hashmap[i] = hashmap.get(i, 0) + 1

        # 遍历哈希表，找出最大奇数次和最小偶数次
        max_odd = 0
        min_even = float("inf")
        for key, value in hashmap.items():
            if value % 2 == 1:
                max_odd = max(max_odd, value)
            else:
                min_even = min(min_even, value)

        # 计算最大差值
        return int(max_odd - min_even)


if __name__ == "__main__":
    solution = Solution()
    s = "aaaaabbc"
    print(solution.maxDifference(s))

    s = "abcabcab"
    print(solution.maxDifference(s))

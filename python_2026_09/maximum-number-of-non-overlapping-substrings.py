class Solution:
    def maxNumOfSubstrings(self, s: str) -> list[str]:
        # 首先，获取所有符合要求的子串

        last = [-1] * 26
        first = [len(s)] * 26
        for i, c in enumerate(s):
            last[ord(c) - 97] = i
            first[ord(c) - 97] = min(first[ord(c) - 97], i)

        # 闭包列表，用 start,end 表示
        closed_intervals = []

        # 遍历所有下标，获取各i为左端点的闭包
        for i, c in enumerate(s):
            # 若 i 不为 c 第一次出现，则不合法，直接跳过
            if i > first[ord(c) - 97]:
                continue

            # 找 i 为左端点的闭包
            # 最开始的有端点为 c 的最后一次出现的位置
            right = last[ord(c) - 97]

            # 下面应该循环查找右端点，直到右端点不再变化为止
            is_valid_left = True
            while True:
                new_right = right
                for j in range(i + 1, right):
                    if i > first[ord(s[j]) - 97]:
                        # 出现了第一次出现在 i 左侧的字符，说明 i 为左端点不合法，直接跳过
                        is_valid_left = False
                        break
                    new_right = max(new_right, last[ord(s[j]) - 97])
                if new_right == right:
                    break
                right = new_right

            if is_valid_left:
                # 将闭包加入结果列表
                closed_intervals.append((i, right))

        # 按照右端点升序排序闭包，选择互不重叠的闭包组合
        closed_intervals.sort(key=lambda x: x[1])
        result = []
        last_end = -1
        for start, end in closed_intervals:
            if start > last_end:
                result.append(s[start : end + 1])
                last_end = end
        return result


if __name__ == "__main__":
    solution = Solution()
    print(solution.maxNumOfSubstrings("adefaddaccc"))
    print(solution.maxNumOfSubstrings("abbaccd"))

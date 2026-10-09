class Solution:
    def minInsertions(self, s: str) -> int:
        """
        >>> solution = Solution()
        >>> solution.minInsertions("(()))")
        1
        >>> solution.minInsertions("())")
        0
        >>> solution.minInsertions("((((((")
        12
        >>> solution.minInsertions(")))))))")
        5
        """
        # 创建一个栈用来保存 (
        stack = []
        count = 0
        i = 0

        # 遍历字符串
        while i < len(s):
            if s[i] == "(":
                # 若为 (，则将其入栈
                stack.append("(")
            else:
                # 若为 )，则先检查是否是连续的两个右括号
                if i == len(s) - 1 or s[i + 1] != ")":
                    # 单个右括号，结果 +1，之后同两个右括号
                    count += 1
                else:
                    # 跳过待处理的第二个右括号
                    i += 1

                if stack:
                    # 如果栈里有 (，则将其出栈
                    stack.pop()
                else:
                    # 栈为空，则结果 +1
                    count += 1
            i += 1

        # 处理栈中剩余的 (
        count += len(stack) * 2

        return count


if __name__ == "__main__":
    import doctest

    doctest.testmod(verbose=True)

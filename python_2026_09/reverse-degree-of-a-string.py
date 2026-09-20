class Solution:
    def reverseDegree(self, s: str) -> int:
        """
        返回字符串 s 的反向度数。字符串的反向度数定义为：对于每个字符，其位置（从 1 开始）乘以该字符在字母表中的反向位置（'a' 为 26，'z' 为 1）之和。

        >>> Solution().reverseDegree("abc")
        148
        >>> Solution().reverseDegree("zaza")
        160
        """
        result = 0
        # 遍历字符串 s
        for i, ch in enumerate(s):
            result = result + (i + 1) * (ord("z") - ord(ch) + 1)
        return result


if __name__ == "__main__":
    import doctest

    doctest.testmod(verbose=True)

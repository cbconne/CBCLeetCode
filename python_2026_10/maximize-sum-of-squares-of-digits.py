class Solution:
    def maxSumOfSquares(self, num: int, sum: int) -> str:
        """
        >>> solution = Solution()
        >>> solution.maxSumOfSquares(2, 3)
        '30'
        >>> solution.maxSumOfSquares(2, 17)
        '98'
        >>> solution.maxSumOfSquares(1, 10)
        ''
        """
        # 先检查是否存在
        # num 位数各数字之和最小为 1，最大为 9 * num，超出这个范围则无解
        if sum > 9 * num:
            return ""
        # 由于 f(x)=x^2 的二阶导 > 0，因此让更大的数尽可能更大能使结果平方和更大
        # 同时要求返回最大的数字，因此更大的数应尽可能放高位
        result = ""
        for i in range(num):
            digit = min(9, sum)
            result = result + str(digit)
            sum -= digit
            if sum < 0:
                break
        return result


if __name__ == "__main__":
    import doctest

    doctest.testmod(verbose=True)

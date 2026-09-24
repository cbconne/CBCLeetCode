class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        """
        >>> solution = Solution()
        >>> solution.smallestIndex([1,3,2])
        2
        >>> solution.smallestIndex([1,10,11])
        1
        >>> solution.smallestIndex([1,2,3])
        -1
        >>> solution.smallestIndex([101,135,2])
        2
        """
        for i, num in enumerate(nums):
            sum = 0
            for digit_char in str(num):
                sum += int(digit_char)
            if sum == i:
                return i
        return -1


if __name__ == "__main__":
    import doctest

    doctest.testmod(verbose=True)

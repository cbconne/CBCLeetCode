class Solution:
    def losingPlayer(self, x: int, y: int) -> str:
        # 分析可知，每一轮只能拿走 1 枚 75 和 4 枚 10 才能满足需求，因此只要简单做除法即可
        return "Bob" if min(x , y // 4) % 2 == 0 else "Alice"


if __name__ == "__main__":
    solution = Solution()
    print(solution.losingPlayer(4, 11))

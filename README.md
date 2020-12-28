# CBCLeetCode

- [CBCLeetCode](#cbcleetcode)
  - [2020.7.28](#2020728)
  - [2020.7.30](#2020730)
  - [2020.8.4](#202084)
  - [2020.8.5](#202085)
  - [2020.8.31](#2020831)
  - [2020.12.18(FindtheDifference)](#20201218findthedifference)
  - [2020.12.21(MinCostClimbingStairs)](#20201221mincostclimbingstairs)
  - [2020.12.25](#20201225)
  - [2020.12.28](#20201228)

Java 刷题&amp;练习 Git/GitHub 使用

- [x] 使用 Git 上传代码
  - [x] Git Bash（命令记不住）
  - [x] Git Gui
  - [x] IDEA
- [x] 最基础的 md 文件编写

## 2020.7.28

- 没事别乱用三目运算符 orz

## 2020.7.30

- 昨天题目太难没写，今天看了题解后自己写的，对于动态规划了解还是太浅，之后碰到可以再看看

## 2020.8.4

- get 了 Java 的队的用法（并没有）

## 2020.8.5

- Map.getOrDefault(Object key, V defaultValue)：当 Map 集合中有指定的 key 时，返回该 key 对应的 value，否则返回指定值。

## 2020.8.31

- 好久没刷了，今天尝试了使用 VSCode 实现代码提交，VSCode 是真的好用 👍

## 2020.12.18(FindtheDifference)

1. String->charArray: toCharArray()s
2. 判断 charArray 中是否含某个 char : Arrays.asList(charArray).contains(char)

md 解法也太骚了吧？第一种就常规解法，第二、三都是什么鬼啊！
[找不同](https://leetcode-cn.com/problems/find-the-difference/solution/zhao-bu-tong-by-leetcode-solution-mtqf/)

## 2020.12.21(MinCostClimbingStairs)

1. 截取数组的方法：
   1. System.arraycopy(源数组名称，源数组开始点，目标数组名称，目标数组开始点，拷贝长度);
   2. java.util.Arrays.copyOf(源数组名称,新数组长度)；

难得思路对了一次……结果思考的方向反了搞得时间复杂度爆炸 orz

## 2020.12.25

1. 数组排序：
   Arrays.sort()

一遍过，舒服了。👍

## 2020.12.28(BestTimetoBuyandSellStockIV)

美好的一天从遇到困难结束。

[买卖股票的最佳时机 IV](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/solution/mai-mai-gu-piao-de-zui-jia-shi-ji-iv-by-8xtkp/)

1. 数组中的最大值：

   Arrays.stream(sell[prices.length - 1]).max().getAsInt()

   stream的相关知识记在notion里了。


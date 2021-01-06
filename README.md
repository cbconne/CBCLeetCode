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
  - [2020.12.28(BestTimetoBuyandSellStockIV)](#20201228besttimetobuyandsellstockiv)
  - [2020.12.29(PatchingArray)](#20201229patchingarray)
  - [2020.12.30(LastStoneWeight)](#20201230laststoneweight)
  - [2020.12.31(NonoverlappingIntervals)](#20201231nonoverlappingintervals)
  - [2021.1.4(Fibonacci)](#202114fibonacci)
  - [2021.1.5(PositionsofLargeGroups)](#202115positionsoflargegroups)
  - [2021.1.6(EvaluateDivision)](#202116evaluatedivision)

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

   stream 的相关知识记在 notion 里了。

## 2020.12.29(PatchingArray)

美好的第二天从遇到困难结束

[按要求补齐数组](https://leetcode-cn.com/problems/patching-array/)

1. int 范围：-2147483648~2147483647（-2^31~2^31-1）

   long 范围：-9223372036854775808 到 9223372036854775807（-2^63~2^63-1)

## 2020.12.30(LastStoneWeight)

美好的第三天从……简单啊，那没事了 😁

等等，还是不会做 🙂

1. PriorityQueue：`PriorityQueue`和`Queue`的区别在于，它的出队顺序与元素的优先级有关，对`PriorityQueue`调用`remove()`或`poll()`方法，返回的总是优先级最高的元素。

   放入`PriorityQueue`的元素，必须实现`Comparable`接口，`PriorityQueue`会根据元素的排序顺序决定出队的优先级。

看完题解自己写，一遍过，好耶~

## 2020.12.31(NonoverlappingIntervals)

美好的年末从完全没有思路的中等开始 🙂

看题解前：什么玩意儿啊

看题解后开始自己写前：不过如此

自己开始写后：orz

不过还好。

1. Arrays.sort 中实现自定义排序：

   ```java
   Arrays.sort(intervals, new Comparator<int[]>() {
               public int compare(int[] interval1, int[] interval2) {
                   return interval1[1] - interval2[1];
               }
   ```

   a<b 且要 a 排在 b 前面，则令实现的 compare 返回 a-b

## 2021.1.4(Fibonacci)

新年第一题从美好的简单斐波那契开始（虽然是因为鸽了三天假期的原因）

最简单的方法很简单，但是后两种数学方法？？？

果然计算机拼到最后还是拼数学……

## 2021.1.5(PositionsofLargeGroups)

美好的一天从 easy 开始（虽然我知道肯定会有各种骚解题方法）

1. 将`List<> a`放入`List<List<>> b`中，然后对`a`执行`a.clear`，`b`中的元素也会被清除：`b`中存放的是`a`的地址并非元素，因此需要深度复制一个新的`List<>`。

竟然没有骚操作？？？？？

## 2021.1.6(EvaluateDivision)

美好的刷题直到遇到一道看都看不懂的 Medium 结束

我认怂了，老老实实 cv。

并查集：[算法学习笔记(1) : 并查集](https://zhuanlan.zhihu.com/p/93647900)

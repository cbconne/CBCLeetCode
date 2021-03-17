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
  - [2021.1.7(NumberofProvinces)](#202117numberofprovinces)
  - [2021.1.8(RotateArray)](#202118rotatearray)
  - [2021.1.11(SmallestStringWithSwaps)](#2021111smalleststringwithswaps)
  - [2021.1.12(SortItemsbyGroupsRespectingDependencies)](#2021112sortitemsbygroupsrespectingdependencies)
  - [2021.1.13(RedundantConnection)](#2021113redundantconnection)
  - [2021.1.14(BinaryPrefixDivisibleBy5)](#2021114binaryprefixdivisibleby5)
  - [2021.1.15(MostStonesRemovedwithSameRoworColumn)](#2021115moststonesremovedwithsameroworcolumn)
  - [2021.1.18(AccountsMerge)](#2021118accountsmerge)
  - [2021.1.19(MinCosttoConnectAllPoints)](#2021119mincosttoconnectallpoints)
  - [2021.1.20(MaximumProductofThreeNumbers)](#2021120maximumproductofthreenumbers)
  - [2021.1.21(FindCriticalandPseudo-CriticalEdgesinMinimumSpanningTree)](#2021121findcriticalandpseudo-criticaledgesinminimumspanningtree)
  - [2021.1.22(AddtoArray-FormofInteger)](#2021122addtoarray-formofinteger)
  - [2021.1.25(RegionsCutBySlashes)](#2021125regionscutbyslashes)
  - [2021.1.26(NumberofEquivalentDominoPairs)](#2021126numberofequivalentdominopairs)
  - [2021.1.28(FindPivotIndex)](#2021128findpivotindex)
  - [2021.1.29(PathWithMinimumEffort)](#2021129pathwithminimumeffort)
  - [2021.2.1(FairCandySwap)](#202121faircandyswap)
  - [2021.2.2(LongestRepeatingCharacterReplacement)](#202122longestrepeatingcharacterreplacement)
  - [2021.2.3(SlidingWindowMedian)](#202123slidingwindowmedian)
  - [2021.2.4(MaximumAverageSubarrayI)](#202124maximumaveragesubarrayi)
  - [2021.2.5(GetEqualSubstringsWithinBudget)](#202125getequalsubstringswithinbudget)
  - [2021.2.7(Non_decreasingArray)](#202127non_decreasingarray)
  - [2021.2.8(LongestTurbulentSubarray)](#202128longestturbulentsubarray)
  - [2021.2.9(SubarrayswithKDifferentIntegers)](#202129subarrayswithkdifferentintegers)
  - [2021.2.19(MaxConsecutiveOnesIII)](#2021219maxconsecutiveonesiii)
  - [2021.2.20(DegreeofanArray)](#2021220degreeofanarray)
  - [2021.2.22(ToeplitzMatrix)](#2021222toeplitzmatrix)
  - [2021.2.23(GrumpyBookstoreOwner)](#2021223grumpybookstoreowner)
  - [2021.2.24(FlippinganImage)](#2021224flippinganimage)
  - [2021.2.25(TransposeMatrix)](#2021225transposematrix)
  - [2021.2.26(NumberofValidWordsforEachPuzzle)](#2021226numberofvalidwordsforeachpuzzle)
  - [2021.3.1(RangeSumQuery_Immutable)](#202131rangesumquery_immutable)
  - [2021.3.2(RangeSumQuery2D_Immutable)](#202132rangesumquery2d_immutable)
  - [2021.3.3(CountingBits)](#202133countingbits)
  - [2021.3.4(RussianDollEnvelopes)](#202134russiandollenvelopes)
  - [2021.3.8(PalindromePartitioningII)](#202138palindromepartitioningii)
  - [2021.3.15(SpiralMatrix)](#2021315spiralmatrix)
  - [2021.3.16(SpiralMatrixII)](#2021316spiralmatrixii)
  - [2021.3.17(DistinctSubsequences)](#2021317distinctsubsequences)

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

1. String->charArray: toCharArray()
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

   long 范围：-9223372036854775808 到 9223372036854775807（-2^63~2^63-1）

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

## 2021.1.7(NumberofProvinces)

真好，昨天并查集今天又来一道 orz……

自己写的！不是 cv 了！~~虽然是边看资料边写的~~

## 2021.1.8(RotateArray)

难度不高，但是看样子放在 Medium 里是因为要多解？

方法一：使用额外数组。不考虑空间复杂度的话太简单，略过；

方法二：环状替代。理解 ing；

方法三：数组翻转。挺好理解的。

- 环状替代

  设置临时变量`temp`，最初令`temp = nums[0]`，按照规则，令`x=(0+k) mod n`，交换`temp`和`nums[x]`，以此类推。直至返回初始位置 0。

  可知，根据数组长度和 k 的不同，当回到初始位置 0 时可能存在部分数字未被遍历，此时应当从下一个数字开始以上过程。

  从 0 开始回到 0 时，恰好走了整数圈`a`，因为遍历一次元素需要走`k`格，遍历元素个数为`b`时有

  $$
  an=bk
  $$

  因为第一次回到起点时就停止，因此`a`应当取最小值

- 数组翻转

  当我们将数组的元素向右移动 $k$次后，尾部 $k\ {\rm{mod}}\ n$个元素会移动至数组头部，其余元素向后移动 $k\ {\rm{mod}}\ n$ 个位置。

  先将所有元素翻转，将尾部的 $k\ {\rm{mod}}\ n$ 个元素移至数组头部，然后再分别翻转 $[0,k\ {\rm mod}\ n-1]$ 区间和 $[k\ {\rm mod}\ n,n-1]$ 区间的元素即可。

  示例：$n=7,k=3$

  |               操作                |     结果      |
  | :-------------------------------: | :-----------: |
  |             原始数组              | 1 2 3 4 5 6 7 |
  |           翻转所有元素            | 7 6 5 4 3 2 1 |
  | 翻转 $[0,k\ {\rm mod}\ n-1]$ 区间 | 5 6 7 4 3 2 1 |
  | 翻转 $[k\ {\rm mod}\ n,n-1]$ 区间 | 5 6 7 1 2 3 4 |

## 2021.1.11(SmallestStringWithSwaps)

又是一道完全没有思路的 medium。

又双叒叕是并查集？？？？？

思路还是蛮清晰的：

- 使用并查集，根据索引对合并所有属于同一个连通分量的索引
- 不同连通分量的索引对应的元素进行排序
- 遍历字符串，依次选择相应连通分量中字典序最小的字符

但是代码太复杂了，我选择 CV 然后有空了再学习（大雾）

## 2021.1.12(SortItemsbyGroupsRespectingDependencies)

hard，CV，告辞。

## 2021.1.13(RedundantConnection)

medium，可以试一试。

nice，在 LeetCode 官方的折磨下已经逐渐掌握并查集了 🙂

## 2021.1.14(BinaryPrefixDivisibleBy5)

easy，好耶

不过好像是个数学问题。

$$
(a+b)\%p=(a\%p+b\%p)\%p
$$

## 2021.1.15(MostStonesRemovedwithSameRoworColumn)

并查集它又 lei 了！

本题关键：

根据可以移除石头的规则：如果一块石头的同行或者同列上有其他石头存在，那么就可以移除这块石头。可以发现：**一定可以把一个连通图里的所有顶点根据这个规则删到只剩下一个顶点。**

将同行同列的石头作为顶点，用直线连接则形成图。在同一个连通图里的石头可以遍历，则按照遍历的逆向移除石头则可只剩下最后一块。

因此：**最多可以移除的石头的个数 = 所有石头的个数 - 连通分量的个数**。

本来以为这么多天折磨下来已经掌握并查集了。

但是完完全全自己默写并查集还是出错了好几次 😭。

总之继续加油。

## 2021.1.18(AccountsMerge)

这个月学不会并查集一个都别想走！

`String[][]`转`List<List<String>>`整半天……

```java
String[][] accounts_l = {
    { "John", "johnsmith@mail.com", "john00@mail.com" },
    { "John", "johnnybravo@mail.com" },
    { "John", "johnsmith@mail.com", "john_newyork@mail.com" },
    { "Mary", "mary@mail.com" }
};
List<List<String>> accounts = new ArrayList<List<String>>();
for (int i = 0; i < accounts_l.length; i++) {
    accounts.add(Arrays.asList(accounts_l[i]));
}
```

- 遍历 Map 类型

  1. 在 for 循环中使用 entries 实现 Map 的遍历：

     ```java
     /**
     * 最常见也是大多数情况下用的最多的，一般在键值对都需要使用
      */
     Map <String,String>map = new HashMap<String,String>();
     map.put("熊大", "棕色");
     map.put("熊二", "黄色");
     for(Map.Entry<String, String> entry : map.entrySet()){
         String mapKey = entry.getKey();
         String mapValue = entry.getValue();
         System.out.println(mapKey+":"+mapValue);
     }
     ```

  2. 在 for 循环中遍历 key 或者 values，一般适用于只需要 map 中的 key 或者 value 时使用，在性能上比使用 entrySet 较好：

     ```java
     Map <String,String>map = new HashMap<String,String>();
     map.put("熊大", "棕色");
     map.put("熊二", "黄色");
     //key
     for(String key : map.keySet()){
         System.out.println(key);
     }
     //value
     for(String value : map.values()){
         System.out.println(value);
     }
     ```

  3. 通过 Iterator 遍历：

     ```java
     Iterator<Entry<String, String>> entries = map.entrySet().iterator();
     while(entries.hasNext()){
         Entry<String, String> entry = entries.next();
         String key = entry.getKey();
         String value = entry.getValue();
         System.out.println(key+":"+value);
     }
     ```

  4. 通过键找值遍历，这种方式的效率比较低，因为本身从键取值是耗时的操作：

     ```java
     for(String key : map.keySet()){
         String value = map.get(key);
         System.out.println(key+":"+value);
     }
     ```

- List 排序

  ```java
  Collections.sort(List)
  ```

爷吐了，48/49，最后一个测试用例还巨 tmd 长……这根本没法找 bug 啊？！

改了改之后全通过了但是超时了……md，老老实实 cv 过了……

## 2021.1.19(MinCosttoConnectAllPoints)

估计是做不来，看题解尽可能学习一下吧。

- 最小生成树

  能够满足任意两点之间有且仅有一条简单路径只有树，而当边有不同权值时，使得总权值最小的生成树为最小生成树。

- Kruskal 算法

  基本思想：从小到大加入边，是一个贪心算法。

  流程：

  1. 将图$G=\{V,E\}$中的所有边按照长度从小到大排序，等长的边任意排序。
  2. 初始化图$G'$为$\{V,\varnothing\}$，从前向后扫描排序的边，如果该边在图中连接了两个相异的连通块，则将它插入图中。
  3. 最后得到的图即为最小生成树。

方法二太数学了……虽然逻辑推导很帅，但是太费脑子……

按照方法一自己尝试下吧。

- 自定义`Collections`的排序规则：

  ```java
  Collections.sort(edgeList, new Comparator<Edge>() {
              public int compare(Edge edge1, Edge edge2) {
                  return edge1.length - edge2.length;
              }
          });
  ```

都写了这么久并查集了结果还是会写错……orz

## 2021.1.20(MaximumProductofThreeNumbers)

Easy，没有并查集。

愉快的一天就此开始~

如果不是心情不好的话就更好了。

一遍过，虽然看了些评论避免了一些坑。

## 2021.1.21(FindCriticalandPseudo-CriticalEdgesinMinimumSpanningTree)

昨天一道 Easy 没有并查集，今天就上来一道 Hard……🤦‍

这是不是过分了点啊！

看上去题解一是给普通人看的，题解二嘛……Tarjan 算法是啥啊，还是简单学习一下吧，notion 见。

- 题解一思路：

  我们首先需要理解题目描述中对于「关键边」和「伪关键边」的定义：

  关键边：如果最小生成树中删去某条边，会导致最小生成树的权值和增加，那么我们就说它是一条关键边。也就是说，如果设原图最小生成树的权值为 $\textit{value}$，那么去掉这条边后：

  要么整个图不连通，不存在最小生成树；

  要么整个图联通，对应的最小生成树的权值为 $v$，其严格大于 $\textit{value}$。

  伪关键边：可能会出现在某些最小生成树中但不会出现在所有最小生成树中的边。也就是说，我们可以在计算最小生成树的过程中，最先考虑这条边，即最先将这条边的两个端点在并查集中合并。设最终得到的最小生成树权值为 $v$，如果 $v = \textit{value}$，那么这条边就是伪关键边。

  需要注意的是，关键边也满足伪关键边对应的性质。因此，我们首先对原图执行 $\texttt{Kruskal}$ 算法，得到最小生成树的权值 $\textit{value}$，随后我们枚举每一条边，首先根据上面的方法判断其是否是关键边，如果不是关键边，再判断其是否是伪关键边。

按照思路自己码代码两遍过了~好耶~

（虽然用时 10.28%，内存 6.54% orz）

## 2021.1.22(AddtoArray-FormofInteger)

Easy 题，好耶~~~

参考了下题解，一遍过啦~

## 2021.1.25(RegionsCutBySlashes)

并查集它又 lei 了！

稍微看了下题解有了思路之后自己写的，一遍过了，好耶~

## 2021.1.26(NumberofEquivalentDominoPairs)

Easy，好耶~

虽然很多细节不是很明确以及参考了题解。

但是一遍过了就是好事。

## 2021.1.28(FindPivotIndex)

昨天忘记打卡了……算了就当放一天假。

easy 还是很简单的……就是各种用例有点骚……

## 2021.1.29(PathWithMinimumEffort)

方法有点多，CV 一下方法相关说明吧。

- 「二分答案」：我们可以对最短路径的长度进行二分。当我们二分枚举到的长度为 $x$ 时，我们只保留所有长度 $\leq x$ 的边。随后从左上角开始进行搜索（深度优先搜索、广度优先搜索）均可，只需要判断是否能够到达右下角即可。如果能够到达右下角，我们就可以减小 $x$ 的值，反之增大 $x$ 的值。

- 「并查集」：我们可以将所有边按照长度进行排序并依次添加进并查集，直到左上角和右下角连通为止。

- 「最短路」：我们可以使用任一单源最短路径的算法（例如 Dijkstra 算法），只需要在维护当前路径长度时，将其修改为题目中的定义即可。

虽然如此……但是我还是选择并查集。

并查集 yyds！

无 bug 两遍过，nice！

## 2021.2.1(FairCandySwap)

二月的第一天从一道美好的 Easy 开始，好耶~

基本思路是对的。

用哈希表空间复杂度上会好一点？时间复杂度应该是一样的。

## 2021.2.2(LongestRepeatingCharacterReplacement)

主要还是思路，知道思路后实现其实不困难。

## 2021.2.3(SlidingWindowMedian)

美好的一天从一道 hard 开始。

二月滑窗月，懂了。

看了下题解想 CV 了……orz……

有点难理解啊。

记录下题解的思路吧：

1. 双优先队列：分别记录滑窗内较小的一半和较大的一半；
2. 延迟删除：因为优先队列无法做到删除非堆顶元素，所以加入哈希表，对需要删除的元素进行标记，等到其成为堆顶时进行删除。

## 2021.2.4(MaximumAverageSubarrayI)

困难题我唯唯诺诺 CV

简单题我重拳出击

平均数最大+数字个数确定==总和最大

对不起我错了 orz

md 一道 easy 错的次数比 hard、medium 都要多 🙂

## 2021.2.5(GetEqualSubstringsWithinBudget)

重点还是理解题意和思路。

看完题解之后觉得不难实现。

鉴于这个月是双指针月，那么就用双指针的方法写吧。

一遍过，很舒服。

## 2021.2.7(Non_decreasingArray)

还是需要好好理解题意，实现并不困难。

## 2021.2.8(LongestTurbulentSubarray)

题目要求很奇怪，理解起来很困难……

然后莫名其妙的小错误特别多……

总之还是过了，虽然看了题解。

## 2021.2.9(SubarrayswithKDifferentIntegers)

年前最后一天，从一道 hard 题开始 😭

思路（题解）：

对于一个固定的左边界来说，满足「恰好存在 `K` 个不同整数的子区间」的右边界 **不唯一**，且形成区间。

把「恰好」改成「最多」就可以使用双指针一前一后交替向右的方法完成，这是因为 对于每一个确定的左边界，最多包含 `K` 种不同整数的右边界是唯一确定的，并且在左边界向右移动的过程中，右边界或者在原来的地方，或者在原来地方的右边。

而「最多存在 `K` 个不同整数的子区间的个数」与「恰好存在 `K` 个不同整数的子区间的个数」的差恰好等于「最多存在 `K−1` 个不同整数的子区间的个数」。

|  最多包含 K 种不同整数的子区间  | 最多包含 K-1 种不同整数的子区间 |
| :-----------------------------: | :-----------------------------: |
|  恰好包含 1 种不同整数的子区间  |  恰好包含 1 种不同整数的子区间  |
|  恰好包含 2 种不同整数的子区间  |  恰好包含 2 种不同整数的子区间  |
|  恰好包含 3 种不同整数的子区间  |  恰好包含 3 种不同整数的子区间  |
|               ……                |               ……                |
| 恰好包含 K-1 种不同整数的子区间 | 恰好包含 K-1 种不同整数的子区间 |
|  恰好包含 K 种不同整数的子区间  |                                 |

**关键点：**

当 left、right 确定了一个最长的包含 K 个不同整数的子区间时，同一个 left 且满足相关要求的子数组的个数即为该区间长度。

没有利用这一点的话 right 就需要回头，导致超时。

**双指针要尽量避免回头！**

## 2021.2.19(MaxConsecutiveOnesIII)

这不是和二号的题本质上一模一样吗 orz

好吧有点不一样……

上班第一天状态不太行……看题解理解了下直接 CV 了

## 2021.2.20(DegreeofanArray)

Easy，好耶~

呜呜呜，好久不见的一遍过

## 2021.2.22(ToeplitzMatrix)

Easy……

而且还是最 easy 的那种 easy……

## 2021.2.23(GrumpyBookstoreOwner)

这题目给爷整懵逼了……

分析一下：

不使用憋气（？）技能的话，满意顾客的总数是确定且不变的，因此要使用憋气技能得到最多的满意顾客其实就是憋气的 X 分钟内要使得尽可能多的原本不满意的顾客变得满意。

求到这个数字的最大值，加上原本满意的顾客即为最终答案。

没看题解一遍过，我好 🐂🍺！

## 2021.2.24(FlippinganImage)

```java
//打印二维数组的地址
System.out.println(arr2.toString());

//打印二维数组的行地址、列地址
System.out.println(Arrays.toString(arr2));

//打印二维数组的内容
System.out.println(Arrays.deepToString(arr2));
```

## 2021.2.25(TransposeMatrix)

最近怎么一直是这种 easy……虽然我也不是抖 M

## 2021.2.26(NumberofValidWordsforEachPuzzle)

淦，我错了，别这样啊。

突然就一道 hard，是不是过分了啊。

忘写了，淦……

## 2021.3.1(RangeSumQuery_Immutable)

前缀和 orz……

## 2021.3.2(RangeSumQuery2D_Immutable)

二维前缀和

## 2021.3.3(CountingBits)

好家伙，题解直接三个 dp 怼脸上……

争取理解一种好吧。

关键点：

利用位运算的技巧，可以在一定程度上提升计算速度。按位与运算（&）的一个性质是：对于任意整数 xx，令 x=x & (x-1)，该运算将 x 的二进制表示的最后一个 1 变成 0。因此，对 x 重复该操作，直到 x 变成 0，则操作次数即为 x 的「一比特数」。

能理解题意并懂得上面的关键点的话其实还好……

## 2021.3.4(RussianDollEnvelopes)

又双叒叕碰到了自定义排序，

## 2021.3.8(PalindromePartitioningII)

不是吧，三天没碰，一回来就是一道 Hard？不讲武德啊？

动态规划判断是否回文串：

> 设 $f(i,j)$ 表示 s[i..j]是否为回文串，那么可得状态转移方程
>
> $$f(i,j)=\begin{cases}True&i\ge j\\f(i+1,j-1)\wedge(s[i]=s[j])&otherwise\end{cases}$$
>
> 其中 ^ 表示与运算。

首先使用 $g(i,j)$ 存储布尔值，表示 $s[i..j]$ 是否为回文串。

然后从 0 开始遍历到 n，分别用 $f[i]$ 表示 $s[0..i]$ 的最小分割次数。

$g(0,i)=True$ 的时候，$f[i]=0$ 不需要分割。

否则 j 从 0 一直遍历到 i，找到 $s[j+1..i]$ 为回文串，$f[i]$ 取 $f[j]+1$ 的最小值。

## 2021.3.15(SpiralMatrix)

## 2021.3.16(SpiralMatrixII)

## 2021.3.17(DistinctSubsequences)

Hard 动归还是有点恶心的……

1. 存储动态规划计算结果：

   本题中为$dp[i][j]$，表示 s 的前 j 个字符串的子序列中出现 t 的前 i 个字符串的个数。

2. 边界条件：

   $dp[0][j]$：s 的前 j 个字符串的子序列中出现空字符串的个数，易知为 1（将所有字符删除）

   $dp[i][0]$：空字符串的子序列中出现的非空字符串的个数，易知为 0

3. 状态转移方程：

   最恶心的东西来了。

   ![Snipaste_2021-03-17_08-46-00](C:\Users\u3666\Desktop\WORK\学习\Java\CBCLeetCode\picture\Snipaste_2021-03-17_08-46-00.png)

   $dp[i-1][j-1]$：由上图可知，若$s[j]==t[i]$，任意$dp[i-1][j-1]$计数过的子序列都会在$dp[i][j]$产生一个对应的子序列

   ![Snipaste_2021-03-17_09-15-20](C:\Users\u3666\Desktop\WORK\学习\Java\CBCLeetCode\picture\Snipaste_2021-03-17_09-15-20.png)

   $dp[i-1][j]$：如上图

   ![Snipaste_2021-03-17_09-16-20](C:\Users\u3666\Desktop\WORK\学习\Java\CBCLeetCode\picture\Snipaste_2021-03-17_09-16-20.png)

   $dp[i][j-1]$：如上图，可知该情况计数过的子序列也必属于$dp[i][j]$

   $dp[i][j]$略

   根据以上分析可得到以下情况：

   考虑 s 和 t 的最后一个字符是否对齐（相等且作为计算子序列时与 t 最后一位对应）

   - 对齐：此时$dp[i][j]=dp[i-1][j-1]$
   - 不对齐：此时$dp[i][j]=dp[i][j-1]$

   当$s[j]==t[i]$，考虑对齐、不对齐两种情况，否则仅不对齐一种情况。

   因此可得状态转移方程如下：

   $$dp[i][j]=\left \{ \begin{array}{c} dp[i][j-1]+dp[i-1][j-1]&s[j]==t[i]\\dp[i][j-1]&else \end{array} \right.$$

   芜湖，一遍过了，虽然思路完全是看题解才想通的。

# 2022.4

- [2022.4](#20224)
  - [4.1 Array of Doubled Pairs](#41-array-of-doubled-pairs)
  - [4.2 Strong Password Checker](#42-strong-password-checker)
  - [4.3 Find Smallest Letter Greater Than Target](#43-find-smallest-letter-greater-than-target)
  - [4.4 Range Sum Query - Mutable](#44-range-sum-query---mutable)
  - [4.5 Prime Number of Set Bits in Binary Representation](#45-prime-number-of-set-bits-in-binary-representation)
  - [4.6 Minimum Height Trees](#46-minimum-height-trees)
  - [4.7 Rotate String](#47-rotate-string)
  - [4.8 N-ary Tree Level Order Traversal](#48-n-ary-tree-level-order-traversal)
  - [4.9 Reaching Points](#49-reaching-points)
  - [4.10 Unique Morse Code Words](#410-unique-morse-code-words)
  - [4.11 Count Numbers with Unique Digits](#411-count-numbers-with-unique-digits)
  - [4.12 Number of Lines To Write String](#412-number-of-lines-to-write-string)
  - [4.13 Insert Delete GetRandom O(1)](#413-insert-delete-getrandom-o1)
  - [4.14 Richest Customer Wealth](#414-richest-customer-wealth)
  - [4.15 Mini Parser](#415-mini-parser)
  - [4.16 Largest Palindrome Product](#416-largest-palindrome-product)
  - [4.17 Most Common Word](#417-most-common-word)
  - [4.18 Lexicographical Numbers](#418-lexicographical-numbers)
  - [4.19 Shortest Distance to a Character](#419-shortest-distance-to-a-character)
  - [4.20 Longest Absolute File Path](#420-longest-absolute-file-path)
  - [4.21 Goat Latin](#421-goat-latin)
  - [4.22 Rotate Function](#422-rotate-function)
  - [4.23 Erect the Fence](#423-erect-the-fence)
  - [4.24 Binary Gap](#424-binary-gap)
  - [4.25 Random Pick Index](#425-random-pick-index)

## 4.1 Array of Doubled Pairs

四月第一题，看了下题解不难理解

虽然是看了题解，很多细坑被绕过去了，但是也算是自己写的代码一遍过了

美好的四月第一天（大雾

## 4.2 Strong Password Checker

一道非常变态的 hard，题解就长得离谱……

我选择 CV

## 4.3 Find Smallest Letter Greater Than Target

是为了平衡一下吗，今天是道 easy

比想象中还简单……甚至没注意到一些题目给出的约束条件就写出来了……

## 4.4 Range Sum Query - Mutable

太难，懒得写，时间也不够。CV 告辞。

## 4.5 Prime Number of Set Bits in Binary Representation

简单题，假期最后一天没什么状态写……就这样吧。

## 4.6 Minimum Height Trees

时间不够&数学题，CV 吧。

果然开了这个头就刹不住车了。

## 4.7 Rotate String

挺简单貌似？不知道是不是有坑？

## 4.8 N-ary Tree Level Order Traversal

对不起！塞尔达太好玩了！

## 4.9 Reaching Points

Hard 直接一手放弃

## 4.10 Unique Morse Code Words

Hard 题我唯唯诺诺，Easy 题我直接一飞冲天啊！（其实还是偷偷看了下题解确认没有什么骚操作）

## 4.11 Count Numbers with Unique Digits

看上去是一道还可以的 medium 题？勇敢尝试一下

尝试个屁，刚写个函数名直接 copilot 全给我补齐了

## 4.12 Number of Lines To Write String

一道 easy，但是一时半会儿没想到解法……

但是 easy 还是 easy 的

## 4.13 Insert Delete GetRandom O(1)

今天的题怎么突然考起数据结构了……有一说一非专业人士这块不过关啊

## 4.14 Richest Customer Wealth

一时没看出来这道题除了加法之外还有什么……

虽然是道 easy 但是也太直接了……

## 4.15 Mini Parser

看不懂，而且是周五，CV 润了

## 4.16 Largest Palindrome Product

是 hard，而且是周六，摆了

## 4.17 Most Common Word

虽然是周末，但是既然是 easy……

数据有点难看，但是通过了

## 4.18 Lexicographical Numbers

有点像之前某道题的前置/简单版

好吧，其实差的还是蛮多的

## 4.19 Shortest Distance to a Character

是一道 easy，但是两次遍历这种思想确实没有想到以前也没接触过，~~又是获取了新知识的满足的一天呢！~~

## 4.20 Longest Absolute File Path

官方题解确实说得太复杂，评论区大神的讲解比较容易理解

## 4.21 Goat Latin

莫名好笑

但是总之还是字符串处理，并不困难

## 4.22 Rotate Function

周五，摸了

## 4.23 Erect the Fence

艹，怎么是道这样的 hard，什么究极数学题

随便选个算法看下吧……写是不太可能自己写了

## 4.24 Binary Gap

这是昨天太难了今天来道 easy 缓一缓吗

## 4.25 Random Pick Index

有点意思，第一种解法很普通没什么问题，第二种学习到了水塘抽样

很久没有认真在这里写过数学证明和推导了，今天重温一下吧

具体方式：当第 $i$ 次遍历到目标时，从 $\{0,1\dots i-1\}$ 中随机抽取数字，当抽取到 $0$ 时，更改返回结果为当前下标

证明：

$$
k\ 个目标中，第\ i\ 次抽取到的目标的下表被返回的概率\\
\ \\
\begin{aligned}
P(select^i_k)&=P(第i次抽取抽中)\cdot P(第i+1次抽取不中)\dots P(第k次抽取不中)\\
&=\frac{1}{i} \cdot (1-\frac{1}{i+1}) \cdot (1-\frac{1}{i+2}) \dots (1-\frac{1}{k})\\
&=\frac 1 k
\end{aligned}\\
$$

因为会被后抽中的下标覆盖，因此第 i 次抽中后前 i-1 次的抽取结果无所谓/不用计算

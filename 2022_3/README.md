# 2022.3

- [2022.3](#20223)
  - [3.19 Construct String from Binary Tree](#319-construct-string-from-binary-tree)
  - [3.20 The Time When the Network Becomes Idle](#320-the-time-when-the-network-becomes-idle)
  - [3.22 Remove Colored Pieces if Both Neighbors are the Same Color](#322-remove-colored-pieces-if-both-neighbors-are-the-same-color)
  - [3.23 K-th Smallest in Lexicographical Order](#323-k-th-smallest-in-lexicographical-order)
  - [3.24 Image Smoother](#324-image-smoother)

## 3.19 Construct String from Binary Tree

题解给了两种方法，据说是递归比较简单。因为还在复健过程中所以就不去硬啃硬骨头了。

比较好理解的递归，比起思路更适合我学习一下 Go 的语法和常用方法。

比如：int 转 string

`str := strconv.Itoa(intvar)`
`str := fmt.Sprintf("%d", intvar)`

## 3.20 The Time When the Network Becomes Idle

看上去数学分析过程比例更大的样子

简单写下分析过程吧……码代码的动力不是很足

首先通过广度优先，计算出 n 个节点到 0 节点的路径长度（虽然我一时半会儿又想不起来广度优先算法怎么写了但是我认为这是基础就不细说了），得到 $dist[n]$，其中 $dist[i]$ 表示节点 $i$ 到 0 节点的最短距离

则可知，节点 $i$ 发出收到第一条消息的返回时间是：$2\times dist[i]$

分两种情况讨论：

1. 当 $patience[i] \ge 2 \times dist[i]$ 时，还未到下一次重发时间就已收到消息，此时节点变为空闲时间为收到消息的下一秒，即 $2 \times dist[i]+1$
2. 当 $patience[i] < 2 \times dist[i]$ 时，下一次重发时间到达时仍未收到消息，会再次发送，空闲时间为收到（收到最初消息回复时刻）（前）（发出的最后一条重发消息）的回复的下一秒，推导过程如下：

   $$
   收到第一条消息回复时刻\\
   （也即单条消息发出至回复所需时间）：\\
   t_{re\_f} = 2\cdot dist\\
   ~\\
   此前重发送的消息数：\\
   n_r = \lfloor \frac{2dist-1}{patience}\rfloor \\
   ~\\
   最后一次重发时刻：\\
   t_{send\_l} = n_r \cdot patience = \lfloor \frac{2dist-1}{patience}\rfloor \cdot patience\\
   ~\\
   最后一次收到回复时刻：\\
   t_{re\_l} = t_{send\_l} + t_{re\_f}\\
   ~\\
   空闲时间：\\
   t_{free} = t_{re\_l} + 1 \\
   = n_r \cdot patience \\
   = \lfloor \frac{2dist-1}{patience}\rfloor \cdot patience + 2\cdot dist + 1
   $$

可以注意到，当$patience[i] \ge 2 \times dist[i]$ 时，$\lfloor \frac{2dist-1}{patience}\rfloor = 0$，因此两种情况合并处理

方法基本都捋出来了，但是看官方题解代码甚至看不懂在干什么……没注释的代码可太难读了……

还是自己写吧

果然实际写代码是学习语言的最快方式，今天了解到了 go 的“数组”和“切片”的区别。

果然，最怕的不是写不出来，也不是写出来了一个用例都跑不过，而是写出来了跑过了一半用例，然后一个巨长无比的用例出错了……你这让我怎么 Debug 啊！

## 3.22 Remove Colored Pieces if Both Neighbors are the Same Color

昨天的题比较简单 ~~(大概)~~，就没什么好记的。

今天的看题面相当复杂，还以为涉及博弈，要考虑每一步的最优解。但其实当原始数据给定的时候结果就已经定了……能赢的人想输都不行。

## 3.23 K-th Smallest in Lexicographical Order

坏了，今天的是道 hard，而且看评论还是道挺难的 hard……

争取不 CV 编程……

字典树的思想，首先是根据 n 得到这棵字典树（本体中不能也不用实际把这棵树存下来），然后遍历该字典树，第 k 个即为结果。

为了不真的把整棵树存下来，需要实现以下方法：在 n 的条件下，判断当前前缀下树有多少个节点。

该方法的基本思路：逐层累加，第 n 层最左侧为 $l_n$，最右侧为 $r_n$，则该层一共 $r_n-l_n+1$ 个节点。考虑上限，则需要考虑 $r_n$ 与上限大小。$l_n=l_{n-1}\times10,r_n=r_{n-1}\times10+9$

在该方法实现的前提下，得到结果的流程为：

1. 前缀为 1；
2. 判断 k 是否在当前前缀下，若是，则进入下一层字典树，遍历数+1，否则，跳到下一个前缀，遍历数加当前前缀下节点数；
3. 循环以上过程，直至遍历数=k

## 3.24 Image Smoother

难得的 easy！争取自己写出来！

漂亮！自己写的而且一边过了！

不过说实话，Copilot 居功至伟……计算平均值的函数基本是它写的……

# 2022.3

- [2022.3](#20223)
  - [3.19 Construct String from Binary Tree](#319-construct-string-from-binary-tree)
  - [3.20 The Time When the Network Becomes Idle](#320-the-time-when-the-network-becomes-idle)

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

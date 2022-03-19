package main

import (
	"fmt"
	"strconv"
)

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func tree2str(root *TreeNode) string {
	if root == nil {
		return ""
	} else if root.Left == nil && root.Right == nil {
		return strconv.Itoa(root.Val)
	} else if root.Left != nil && root.Right == nil {
		return fmt.Sprintf("%d(%s)", root.Val, tree2str(root.Left))
	} else if root.Right != nil && root.Left == nil {
		return fmt.Sprintf("%d()(%s)", root.Val, tree2str(root.Right))
	} else {
		return fmt.Sprintf("%d(%s)(%s)", root.Val, tree2str(root.Left), tree2str(root.Right))
	}
}

func main() {

	root := &TreeNode{Val: 1}
	root.Left = &TreeNode{Val: 2}
	root.Left.Right = &TreeNode{Val: 3}
	root.Right = &TreeNode{Val: 3}
	fmt.Print(tree2str(root))

}

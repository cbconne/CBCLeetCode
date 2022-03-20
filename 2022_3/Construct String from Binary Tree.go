package study2022_3

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

func Tree2str(root *TreeNode) string {
	if root == nil {
		return ""
	} else if root.Left == nil && root.Right == nil {
		return strconv.Itoa(root.Val)
	} else if root.Left != nil && root.Right == nil {
		return fmt.Sprintf("%d(%s)", root.Val, Tree2str(root.Left))
	} else if root.Right != nil && root.Left == nil {
		return fmt.Sprintf("%d()(%s)", root.Val, Tree2str(root.Right))
	} else {
		return fmt.Sprintf("%d(%s)(%s)", root.Val, Tree2str(root.Left), Tree2str(root.Right))
	}
}

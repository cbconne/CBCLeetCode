package main

import (
	study2022_3 "./2022_3"
)

func main() {
	root := study2022_3.TreeNode{Val: 2}
	root.Left = &study2022_3.TreeNode{Val: 0}
	root.Right = &study2022_3.TreeNode{Val: 3}
	root.Left.Left = &study2022_3.TreeNode{Val: -4}
	root.Left.Right = &study2022_3.TreeNode{Val: 1}
	// root.Right.Right = &study2022_3.TreeNode{Val: 7}
	println(study2022_3.FindTarget(&root, -1))
}

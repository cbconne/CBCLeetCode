package study2023_05

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

func delNodes(root *TreeNode, to_delete []int) []*TreeNode {
	// 获得待删除节点的 map
	delete_map := make(map[int]bool)
	for _, v := range to_delete {
		delete_map[v] = true
	}
	// 递归删除节点
	res := []*TreeNode{}
	delNode(root, delete_map, true, &res)
	return res
}

func delNode(node *TreeNode, delete_map map[int]bool, is_root bool, res *[]*TreeNode) *TreeNode {
	// node == nil 时，返回 nil（递归出口）
	if node == nil {
		return nil
	}
	// 如果当前节点需要删除，则左右子树为潜在新增根节点，递归删除左右子树
	if delete_map[node.Val] {
		delNode(node.Left, delete_map, true, res)
		delNode(node.Right, delete_map, true, res)
		return nil
	}
	// 如果当前节点为潜在根节点且不需要删除，则将其加入结果集
	if is_root {
		*res = append(*res, node)
	}

	// 递归删除左右子树
	node.Left = delNode(node.Left, delete_map, false, res)
	node.Right = delNode(node.Right, delete_map, false, res)
	return node
}

func DelNodesTest() {
	root := &TreeNode{
		Val: 1,
		Left: &TreeNode{
			Val:  2,
			Left: &TreeNode{Val: 4},
			Right: &TreeNode{
				Val: 5,
			},
		},
		Right: &TreeNode{
			Val:  3,
			Left: &TreeNode{Val: 6},
			Right: &TreeNode{
				Val: 7,
			},
		},
	}
	to_delete := []int{3, 5}
	res := delNodes(root, to_delete)
	for _, v := range res {
		println(v.Val)
	}
}

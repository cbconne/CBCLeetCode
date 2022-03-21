package study2022_3

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func FindTarget(root *TreeNode, k int) bool {
	set := map[int]bool{}
	var dfs func(*TreeNode) bool
	dfs = func(node *TreeNode) bool {
		if node == nil {
			return false
		} else if _, ok := set[k-node.Val]; ok {
			return true
		} else {
			set[node.Val] = true
			return dfs(node.Left) || dfs(node.Right)
		}
	}
	return dfs(root)
}

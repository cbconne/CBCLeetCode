public class IncreasingOrderSearchTree {

    private TreeNode resTreeNode;

    public static void main(String[] args) {
        IncreasingOrderSearchTree increasingOrderSearchTree = new IncreasingOrderSearchTree();
        TreeNode treeNode1 = new TreeNode(2, new TreeNode(1), null);
        TreeNode treeNode2 = new TreeNode(3, treeNode1, new TreeNode(4));
        TreeNode treeNode3 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode treeNode4 = new TreeNode(6, null, treeNode3);
        TreeNode root = new TreeNode(5, treeNode2, treeNode4);
        TreeNode treeNode = increasingOrderSearchTree.increasingBST(root);
        System.out.println("ok");
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode startNode = new TreeNode(-1);
        resTreeNode = startNode;
        inorder(root);
        return startNode.right;
    }

    public void inorder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        inorder(treeNode.left);

        treeNode.left = null;
        resTreeNode.right = treeNode;
        resTreeNode = treeNode;

        inorder(treeNode.right);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class MDepthofBinaryTree {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int DL = maxDepth(root.left);
            int DR = maxDepth(root.right);
            return Math.max(DL,DR) + 1;
        }
    }
}
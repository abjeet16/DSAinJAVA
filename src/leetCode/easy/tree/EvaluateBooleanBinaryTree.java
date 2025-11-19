package leetCode.easy.tree;

/// 2331. Evaluate Boolean Binary Tree
public class EvaluateBooleanBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 0 represents False and 1 represents True.
     * 2 represents the boolean OR and
     * 3 represents the boolean AND.
     */
    /*public boolean evaluateTree(TreeNode root) {

    }*/
}

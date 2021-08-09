package net.moon._101_对称二叉树;

/**
 * @author moonlan
 * date 2021/5/23 9:38
 */
@SuppressWarnings(value = "unused")
public class Main {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) { this.val = val; }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val == q.val) {
            return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
        } else {
            return false;
        }
    }
}

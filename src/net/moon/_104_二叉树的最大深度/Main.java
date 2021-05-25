package net.moon._104_二叉树的最大深度;

/**
 * @author moonlan
 * date 2021/5/24 10:11
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(new Main().maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left, 1), maxDepth(root.right, 1));
    }

    private int maxDepth(TreeNode root, int dep) {
        if (root == null)
            return dep;
        return Math.max(maxDepth(root.left, dep + 1), maxDepth(root.right, dep + 1));
    }
}

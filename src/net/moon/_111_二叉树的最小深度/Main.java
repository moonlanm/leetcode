package net.moon._111_二叉树的最小深度;

/**
 * @author moonlan
 * date 2021/5/24 11:55
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
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);
        System.out.println(new Main().minDepth(root));
    }

    //public int minDepth(TreeNode root) {
    //    if (root == null)
    //        return 0;
    //    return Math.min(minDepth(root.left, 1), minDepth(root.right, 1));
    //}
    //
    //private int minDepth(TreeNode root, int dep) {
    //    if (root == null)
    //        return dep;
    //
    //    if (root.left == null && root.right == null)
    //        return dep + 1;
    //    int left = minDepth(root.left, dep + 1);
    //    int right = minDepth(root.right, dep + 1);
    //    return Math.min(left, right);
    //}

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }

        return min_depth + 1;
    }

}

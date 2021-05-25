package net.moon._110_平衡二叉树;

/**
 * @author moonlan
 * date 2021/5/24 10:42
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
        //root.left = new TreeNode(2);
        //root.right = new TreeNode(3);
        //root.right.left = new TreeNode(4);
        //root.right.right = new TreeNode(5);
        //root.right.right.right = new TreeNode(6);
        //System.out.println(new Main().isBalanced(root));

        System.out.println("---------------------");
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        //root.left.right = new TreeNode(3);
        //root.left.left.left = new TreeNode(4);
        //root.left.left.right = new TreeNode(4);
        //System.out.println(new Main().isBalanced(root));
        System.out.println("---------------------");
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);
        System.out.println(new Main().isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return (Math.abs(high(root.left, 1) - high(root.right, 1)) <= 1) && isBalanced(root.right) && isBalanced(root.left);
    }

    private int high(TreeNode root, int high) {
        if (root == null)
            return high;
        int left = high(root.left, high + 1);
        int right = high(root.right, high + 1);
        return Math.max(left, right);
    }
}

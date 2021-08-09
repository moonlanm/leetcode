package net.moon.每日一题;

/**
 * @author moonlan
 * date 2021/4/27 11:18
 */
@SuppressWarnings(value = "unused")
class TreeNode {
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

public class _4_27_Main {

    int sum = 0;

    public static void main(String[] args) {
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return sum;
        }

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        if (root.val < low) {
            rangeSumBST(root.right, low, high);
        } else if (root.val > high) {
            rangeSumBST(root.left, low, high);
        } else {
            rangeSumBST(root.right, low, high);
            rangeSumBST(root.left, low, high);
        }

        return sum;
    }

    public int rangeSumBST2(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

}

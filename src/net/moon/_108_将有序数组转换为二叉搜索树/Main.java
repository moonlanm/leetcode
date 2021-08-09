package net.moon._108_将有序数组转换为二叉搜索树;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author moonlan
 * date 2021/5/24 10:32
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

        @Override
        public String toString() {
            return new StringJoiner(", ", TreeNode.class.getSimpleName() + "[", "]")
                    .add("val=" + val)
                    .add("left=" + left)
                    .add("right=" + right)
                    .toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Main().sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int mid = nums.length / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return node;
    }
}

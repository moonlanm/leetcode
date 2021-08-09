package net.moon._94_二叉树的中序遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @author moonlan
 * date 2021/5/22 16:16
 */
@SuppressWarnings(value = "unused")
public class Main {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) { this.val = val; }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        //TreeNode root = new TreeNode(1);
        //root.right = new TreeNode(2);
        //root.right.left = new TreeNode(3);
        System.out.println(main.inorderTraversal(null));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> ret = inorderTraversal(root, list);
        return ret == null ? list : ret;
    }

    private List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return null;
        }

        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
        return list;
    }
}

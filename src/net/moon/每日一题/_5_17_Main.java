package net.moon.每日一题;

/**
 * @author moonlan
 * date 2021/5/17 10:01
 */
@SuppressWarnings(value = "unused")
public class _5_17_Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);
        _5_17_Main main = new _5_17_Main();
        boolean cousins = main.isCousins(treeNode, 5, 4);
        System.out.println(cousins);
    }

    int xDepth = 0;
    int yDepth = 0;
    int xParent = 0;
    int yParent = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        func(root, 0, x, y, root.val);
        return xDepth == yDepth && xParent != yParent;
    }

    public void func(TreeNode root, int dep, int x, int y, int parent) {
        if (root == null) {
            return;
        }

        if (root.val == x) {
            xParent = parent;
            xDepth = dep;
        }

        if (root.val == y) {
            yParent = parent;
            yDepth = dep;
        }
        func(root.left, dep + 1, x, y, root.val);
        func(root.right, dep + 1, x, y, root.val);
    }
}

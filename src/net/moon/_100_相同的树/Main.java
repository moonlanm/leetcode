package net.moon._100_相同的树;

import java.util.Stack;

/**
 * @author moonlan
 * date 2021/5/22 16:33
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        net.moon._94_二叉树的中序遍历.Main.TreeNode head1 = new net.moon._94_二叉树的中序遍历.Main.TreeNode(1);
        //head1.left = new net.moon._94_二叉树的中序遍历.Main.TreeNode(2);
        //head1.right = new net.moon._94_二叉树的中序遍历.Main.TreeNode(1);

        net.moon._94_二叉树的中序遍历.Main.TreeNode head2 = new net.moon._94_二叉树的中序遍历.Main.TreeNode(1);
        //head2.left = new net.moon._94_二叉树的中序遍历.Main.TreeNode(null);
        head2.right = new net.moon._94_二叉树的中序遍历.Main.TreeNode(2);
        System.out.println(new Main().isSameTree(head1,head2));
    }

    public boolean isSameTree(net.moon._94_二叉树的中序遍历.Main.TreeNode p, net.moon._94_二叉树的中序遍历.Main.TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        Stack<net.moon._94_二叉树的中序遍历.Main.TreeNode> stackP = new Stack<>();
        Stack<net.moon._94_二叉树的中序遍历.Main.TreeNode> stackQ = new Stack<>();
        while ((p != null || !stackP.isEmpty()) && (q != null || !stackQ.isEmpty())) {
            while (p != null && q != null) {
                if (p.val == q.val) {
                    stackP.push(p);
                    stackQ.push(q);
                    p = p.left;
                    q = q.left;
                } else {
                    return false;
                }
            }
            if (p != null || q != null) {
                return false;
            }
            if (!stackP.isEmpty() && !stackQ.isEmpty()) {
                p = stackP.pop();
                q = stackQ.pop();
                if (p.val == q.val) {
                    p = p.right;
                    q = q.right;
                } else {
                    return false;
                }
            }

            if ((p == null && q != null) || (p != null && q == null)) {
                return false;
            }
        }

        return true;
    }
}

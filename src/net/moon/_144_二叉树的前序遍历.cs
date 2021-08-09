using System.Collections.Generic;

namespace _144_二叉树的前序遍历
{

    public class TreeNode
    {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val = 0, TreeNode left = null, TreeNode right = null)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public class Solution
    {
        public IList<int> PreorderTraversal(TreeNode root)
        {
            var list = new List<int>();
            Bl(root, list);
            return list;
        }

        private void Bl(TreeNode cur, IList<int> list)
        {
            if (cur == null)
            {
                return;
            }
            list.Add(cur.val);
            Bl(cur.left, list);
            Bl(cur.right, list);
        }
    }
}
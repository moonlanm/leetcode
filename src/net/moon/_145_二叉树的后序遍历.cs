using System.Collections.Generic;
using _144_二叉树的前序遍历;

namespace _145_二叉树的后序遍历
{
    public class Solution
    {
        public IList<int> PostorderTraversal(TreeNode root)
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
            Bl(cur.left, list);
            Bl(cur.right, list);
            list.Add(cur.val);
        }
    }
}
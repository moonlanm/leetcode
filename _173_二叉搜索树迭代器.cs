using System.Collections.Generic;
using _144_二叉树的前序遍历;

namespace _173_二叉搜索树迭代器
{
    public class BSTIterator
    {

        private TreeNode _cur;
        private Stack<TreeNode> _stack = new Stack<TreeNode>();

        public BSTIterator(TreeNode root)
        {
            _cur = root;
            _stack.Push(_cur);
            while (_cur.left != null)
            {
                _stack.Push(_cur.left);
                _cur = _cur.left;
            }
        }

        public int Next()
        {
            _cur = _stack.Pop();

            if (_cur.right != null)
            {
                _stack.Push(_cur);
            }

            while (_cur.left != null)
            {
                _stack.Push(_cur.left);
                _cur = _cur.left;
            }
            
            return _cur.val;
        }

        public bool HasNext()
        {
            return _stack.Peek() != null;
        }
    }
}
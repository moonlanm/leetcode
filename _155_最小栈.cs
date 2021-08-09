using System;
using System.Collections.Generic;

namespace _155_最小栈
{
    public class MinStack
    {
        private Stack<int> _stack = new Stack<int>();
        private Stack<int> _minStack = new Stack<int>();

        public MinStack()
        {
            _minStack.Push(int.MaxValue);
        }

        public void Push(int val)
        {
            _stack.Push(val);
            _minStack.Push(Math.Min(val, _minStack.Peek()));
        }

        public void Pop()
        {
            _stack.Pop();
            _minStack.Pop();
        }

        public int Top()
        {
            return _stack.Peek();
        }

        public int GetMin()
        {
            return _minStack.Peek();
        }
    }
}
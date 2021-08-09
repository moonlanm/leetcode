using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Leetcode
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            _144_二叉树的前序遍历.Solution solution = new _144_二叉树的前序遍历.Solution();
            _144_二叉树的前序遍历.TreeNode root = new _144_二叉树的前序遍历.TreeNode();
            root.val = 1;
            _144_二叉树的前序遍历.TreeNode n1 = new _144_二叉树的前序遍历.TreeNode();
            n1.val = 2;
            _144_二叉树的前序遍历.TreeNode n2 = new _144_二叉树的前序遍历.TreeNode();
            n2.val = 3;
            root.right = n1;
            n1.left = n2;
            var list = solution.PreorderTraversal(root);
            Assert.IsTrue(list.SequenceEqual(new List<int>() { 1, 2, 3 }), "diff");
        }

        [TestMethod]
        public void TestMethod2()
        {
            _145_二叉树的后序遍历.Solution solution = new _145_二叉树的后序遍历.Solution();
            _144_二叉树的前序遍历.TreeNode root = new _144_二叉树的前序遍历.TreeNode();
            root.val = 1;
            _144_二叉树的前序遍历.TreeNode n1 = new _144_二叉树的前序遍历.TreeNode();
            n1.val = 2;
            _144_二叉树的前序遍历.TreeNode n2 = new _144_二叉树的前序遍历.TreeNode();
            n2.val = 3;
            root.right = n1;
            n1.left = n2;
            var list = solution.PostorderTraversal(root);
            Assert.IsTrue(list.SequenceEqual(new List<int>() { 3, 2, 1 }), "diff");
        }

        [TestMethod]
        public void TestMethod3()
        {
            _155_最小栈.MinStack minStack = new _155_最小栈.MinStack();
            minStack.Push(-2);
            minStack.Push(0);
            minStack.Push(-3);
            Assert.IsTrue(minStack.GetMin() == -3, $"not -3 but {minStack.GetMin()}");
            minStack.Pop();
            Assert.IsTrue(minStack.Top() == 0, $"not 0 but {minStack.Top()}");
            Assert.IsTrue(minStack.GetMin() == -2, $"not -2 but {minStack.GetMin()}");
        }

        [TestMethod]
        public void TestMethod4()
        {
            _167_两数之和2_输入有序数组.Solution solution = new _167_两数之和2_输入有序数组.Solution();
            var ret = solution.TwoSum(new[] { 2, 7, 11, 15 }, 9);
            Assert.IsTrue(ret.SequenceEqual(new[] { 1, 2 }), $"not equals. ret is {string.Join(',', ret)}");
        }
        [TestMethod]
        public void TestMethod5()
        {
            _168_Excel表列名称.Solution solution = new _168_Excel表列名称.Solution();
            Func<int, string> func = (columnNumber) =>
            {
                StringBuilder sb = new StringBuilder();
                while (columnNumber > 0)
                {
                    int a0 = (columnNumber - 1) % 26 + 1;
                    sb.Append((char)(a0 - 1 + 'A'));
                    columnNumber = (columnNumber - a0) / 26;
                }
                char[] arr = sb.ToString().ToCharArray();
                Array.Reverse(arr);
                return new string(arr);
            };
            for (int i = 1; i <= 50; i++)
            {
                Assert.IsTrue(solution.ConvertToTitle(i) == func(i), $"not equal. i = {i}, ConvertToTitle = {solution.ConvertToTitle(i)}, func = {func(i)}");
            }
        }


        [TestMethod]
        public void TestMethod6()
        {
            _169_多数元素.Solution solution = new _169_多数元素.Solution();
            var ret = solution.MajorityElement(new[] { 2, 2, 1, 1, 1, 2, 2 });
            Assert.AreEqual(ret, 2);
        }

        [TestMethod]
        public void TestMethod7()
        {
            _6_Z字形变换.Solution solution = new _6_Z字形变换.Solution();
            var ret = solution.Convert("PAYPALISHIRING", 3);
            Assert.IsTrue(ret == "PAHNAPLSIIGYIR", $"diff. ret = {ret}");
            ret = solution.Convert("PAYPALISHIRING", 4);
            Assert.IsTrue(ret == "PINALSIGYAHRPI", $"diff. ret = {ret}");
        }

        [TestMethod]
        public void TestMethod8()
        {
            _8_字符串转换整数_atoi.Solution solution = new _8_字符串转换整数_atoi.Solution();
            var ret = solution.MyAtoi("123");
            Assert.IsTrue(ret == 123, $"1 not 123 but {ret}");
            ret = solution.MyAtoi("-123");
            Assert.IsTrue(ret == -123, $"2 not -123 but {ret}");
            ret = solution.MyAtoi("  123");
            Assert.IsTrue(ret == 123, $"3 not 123 but {ret}");
            ret = solution.MyAtoi("+123");
            Assert.IsTrue(ret == 123, $"4 not 123 but {ret}");
            ret = solution.MyAtoi("  +123");
            Assert.IsTrue(ret == 123, $"5 not 123 but {ret}");
            ret = solution.MyAtoi("123  ABCD  ");
            Assert.IsTrue(ret == 123, $"6 not 123 but {ret}");
            ret = solution.MyAtoi("ABCD 123");
            Assert.IsTrue(ret == 0, $"7 not 0 but {ret}");
            ret = solution.MyAtoi("-91283472332");
            Assert.IsTrue(ret == -2147483648, $"7 not -2147483648 but {ret}");
        }

        [TestMethod]
        public void TestMethod9()
        {
            _11_盛最多水的容器.Solution solution = new _11_盛最多水的容器.Solution();
            var ret = solution.MaxArea(new[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
            Assert.IsTrue(ret == 49, $"not 49 but {ret}");
        }

        [TestMethod]
        public void TestMethod10()
        {
            _171_Excel表列序号.Solution solution = new _171_Excel表列序号.Solution();
            var ret = solution.TitleToNumber("ZY");
            Assert.IsTrue(ret == 701, $"not 701 but {ret}");
            ret = solution.TitleToNumber("FXSHRXW");
            Assert.IsTrue(ret == int.MaxValue, $"not ${int.MaxValue} but {ret}");
        }

        [TestMethod]
        public void TestMethod11()
        {
            _172_阶乘后的零.Solution solution = new _172_阶乘后的零.Solution();
            var ret = solution.TrailingZeros(25);
            Assert.IsTrue(ret == 6, $"not 6 but ${ret}");
        }

        [TestMethod]
        public void TestMethod12()
        {
            _144_二叉树的前序遍历.TreeNode root = new _144_二叉树的前序遍历.TreeNode(7);
            root.left = new _144_二叉树的前序遍历.TreeNode(3);
            root.right = new _144_二叉树的前序遍历.TreeNode(15);
            root.right.left = new _144_二叉树的前序遍历.TreeNode(9);
            root.right.right = new _144_二叉树的前序遍历.TreeNode(20);
            _173_二叉搜索树迭代器.BSTIterator iterator = new _173_二叉搜索树迭代器.BSTIterator(root);
            var ret = iterator.Next();
            Assert.AreEqual(ret, 3, $"not 3 but {ret}");
            ret = iterator.Next();
            Assert.AreEqual(ret, 7, $"not 7 but {ret}");
            var boolRet = iterator.HasNext();
            Assert.AreEqual(boolRet, true, $"not true but {boolRet}");
            ret = iterator.Next();
            Assert.AreEqual(ret, 9, $"not 9 but {ret}");
            boolRet = iterator.HasNext();
            Assert.AreEqual(boolRet, true, $"not true but {boolRet}");
            ret = iterator.Next();
            Assert.AreEqual(ret, 15, $"not 15 but {ret}");
            boolRet = iterator.HasNext();
            Assert.AreEqual(boolRet, true, $"not true but {boolRet}");
            ret = iterator.Next();
            Assert.AreEqual(ret, 20, $"not 20 but {ret}");
            boolRet = iterator.HasNext();
            Assert.AreEqual(boolRet, true, $"not true but {boolRet}");
        }
    }
}

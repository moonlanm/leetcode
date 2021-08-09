using System;
using System.Collections.Generic;
using System.Text;

namespace _6_Z字形变换
{
    public class Solution
    {
        public string Convert(string s, int numRows)
        {
            if (numRows == 1)
            {
                return s;
            }

            List<StringBuilder> list = new List<StringBuilder>();

            for (int i = 0; i < numRows; i++)
            {
                list.Add(new StringBuilder());
            }

            int cur = 0;
            bool flag = false;
            int index = 0;
            while (true)
            {
                if (index >= s.Length)
                {
                    break;
                }
                if (cur == 0 || cur == numRows - 1)
                {
                    flag = !flag;
                }

                list[cur].Append(s[index++]);
                cur = flag ? cur + 1 : cur - 1;
            }
            return string.Join("", list);
        }
    }
}
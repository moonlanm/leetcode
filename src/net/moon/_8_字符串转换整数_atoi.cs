using System;
using System.Diagnostics;

namespace _8_字符串转换整数_atoi
{
    public class Solution
    {
        public int MyAtoi(string s)
        {
            var arr = System.Text.RegularExpressions.Regex.Replace(s, "([a-zA-Z\\s]*$)", "").ToCharArray();
            Debug.WriteLine(string.Join(',', arr));
            double sum = 0;
            int pow = arr.Length - 1;
            Debug.WriteLine($"pow = {pow}");
            bool isPositive = true;
            foreach (var item in arr)
            {
                if (item == ' ')
                {
                    pow--;
                    continue;
                }

                if (item == '+')
                {
                    isPositive = true;
                    pow--;
                    continue;
                }

                if (item == '-')
                {
                    pow--;
                    isPositive = false;
                    continue;
                }

                if (item < '0' || item > '9')
                {
                    break;
                }

                int num = item - '0';
                sum += (num * Math.Pow(10, pow--));
                Debug.WriteLine($"sum = {sum}");
            }
            return isPositive ? sum > int.MaxValue ? int.MaxValue : (int)sum : -sum < int.MinValue ? int.MinValue : -(int)sum;
        }
    }
}
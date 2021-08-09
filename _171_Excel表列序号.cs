using System;
using System.Diagnostics;

namespace _171_Excel表列序号
{
    public class Solution
    {
        public int TitleToNumber(string columnTitle)
        {
            int sum = 0;
            for (int i = columnTitle.Length - 1, strIndex = 0; i >= 0 && strIndex < columnTitle.Length; i--, strIndex++)
            {
                var pow = Math.Pow(26, i);
                Debug.WriteLine($"pow = {pow}");
                sum += (int)((columnTitle[strIndex] - 'A' + 1) * pow);
                Debug.WriteLine($"columnTitle[{strIndex}] - 'A' = {(columnTitle[strIndex] - 'A' + 1)} and sum += {(columnTitle[strIndex] - 'A') * pow}");
            }
            Debug.WriteLine($"sum = {sum}");
            return sum;
        }
    }
}
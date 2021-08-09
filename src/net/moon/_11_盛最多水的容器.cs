using System;
using System.Diagnostics;

namespace _11_盛最多水的容器
{
    public class Solution
    {
        public int MaxArea(int[] height)
        {
            int low = 0;
            int high = height.Length - 1;
            int max = 0;
            while (low < high)
            {
                var m = Math.Min(height[low], height[high]) * (high - low);
                max = m > max ? m : max;
                Debug.WriteLine($"max = {max}");
                if (height[low] < height[high])
                {
                    low++;
                    continue;
                }

                if (height[low] > height[high])
                {
                    high--;
                    continue;
                }
            }

            return max;
        }
    }
}
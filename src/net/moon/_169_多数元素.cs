using System;
using System.Collections.Generic;
using System.Linq;

namespace _169_多数元素
{
    public class Solution
    {
        public int MajorityElement(int[] nums)
        {
            // Dictionary<int, int> dict = new Dictionary<int, int>();
            // for (int i = 0; i < nums.Length; i++)
            // {
            //     if (dict.ContainsKey(nums[i]))
            //     {
            //         dict[nums[i]]++;
            //     }
            //     else
            //     {
            //         dict.Add(nums[i], 1);
            //     }
            // }

            // dict.OrderByDescending((pair) => pair.Value);
            // return dict.First().Key;
            Array.Sort(nums);
            return nums[nums.Length / 2];
        }
    }
}
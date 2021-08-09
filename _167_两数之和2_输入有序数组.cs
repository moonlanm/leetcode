namespace _167_两数之和2_输入有序数组
{
    public class Solution
    {
        public int[] TwoSum(int[] numbers, int target)
        {
            /*
            int index1 = 0, index2 = 0;
            for (int i = 0; i < numbers.Length; i++)
            {
                for (int j = 0; j < numbers.Length; j++)
                {
                    if (j >= target)
                    {
                        goto end;
                    }

                    if (numbers[i] + numbers[j] == target)
                    {
                        System.Console.WriteLine($"i = {i}, j = {j}");
                        index1 = i;
                        index2 = j;
                        goto end;
                    }
                }
            }
        end:
            return index1 == 0 && index2 == 0 ? null : new[] { index1 + 1, index2 + 1 };*/

            int low = 0, high = numbers.Length - 1;
            while (low < high)
            {
                var sum = numbers[low] + numbers[high];
                if (sum == target)
                {
                    return new[] { low + 1, high + 1 };
                }
                if (sum < target)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }

            return new[] { -1, -1 };
        }
    }
}
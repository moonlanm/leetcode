namespace _172_阶乘后的零
{
    public class Solution
    {
        public int TrailingZeros(int n)
        {
            int count = 0;
            int num = 5;
            while (n / num != 0)
            {
                count += n / num;
                num *= 5;
            }

            return count;
        }
    }
}
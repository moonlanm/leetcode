namespace _190_颠倒二进制位
{
    public class Solution
    {
        // 可以使用位运算，在不计算二进制值的情况下就获取到二进制的某一位
        public uint reverseBits(uint n)
        {
            uint rev = 0;
            for (int i = 0; i < 32 && n > 0; i++)
            {
                rev |= (n & 1) << (31 - i);
                n >>= 1;
            }
            return rev;
        }
    }
}
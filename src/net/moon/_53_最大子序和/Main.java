package net.moon._53_最大子序和;

/**
 * @author moonlan
 * date 2021/5/6 10:05
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(new Main().maxSubArray(new int[]{1}));
    }

    // dp数组存储的应该是连续的几个数的和
    // 递推公式应该类似于dp[i] = Math.max(xxx, dp[i - 1])这种
    // 其中xxx应该是递归求和？
    //
    // 递推公式是dp[i] = Math.max(dp[i - 1] + nums[i], nums[i])
    // 当前的值是 (上一个值+当前数的和 跟 当前数) 两个当中更大的一个
    // 因此dp数组存储的是从头开始加到当前数的最大的和
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num); //这是当前的最大值
            max = Math.max(pre, max); // 比较历史最大值和当前最大值
        }
        return max;
    }
}

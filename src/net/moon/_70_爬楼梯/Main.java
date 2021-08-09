package net.moon._70_爬楼梯;

/**
 * @author moonlan
 * date 2021/5/17 10:41
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.climbStairs(4));
    }

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }
}

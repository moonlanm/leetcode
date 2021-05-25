package net.moon.每日一题;

/**
 * @author moonlan
 * date 2021/5/11 16:51
 */
@SuppressWarnings(value = "unused")
public class _5_11_Main {
    public static void main(String[] args) {
        _5_11_Main main = new _5_11_Main();
        System.out.println(main.myPow(2, 10));
        System.out.println(main.myPow(5, 3));
        System.out.println(main.myPow(3, 7));
        System.out.println(main.myPow(4, 2));
    }

    private double cal(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double y = cal(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }

    public double myPow(double x, int n) {
        return n >= 0 ? cal(x, n) : 1 / cal(x, -n);
    }
}

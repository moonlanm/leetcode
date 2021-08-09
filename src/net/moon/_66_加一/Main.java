package net.moon._66_加一;

import java.util.Arrays;

/**
 * @author moonlan
 * date 2021/5/6 16:40
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Main().plusOne(new int[]{8,9,9,9})));
        System.out.println(Arrays.toString(new Main().plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(new Main().plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(new Main().plusOne(new int[]{0})));
        System.out.println(Arrays.toString(new Main().plusOne(new int[]{9})));
        System.out.println(Arrays.toString(new Main().plusOne(new int[]{9,9,9})));
        System.out.println(Arrays.toString(new Main().plusOne(new int[]{9,9})));
    }

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        int right = digits.length - 1;
        int inc = 0;
        while (right >= 0) {
            digits[right] += inc;
            inc = 0;
            if (digits[right] >= 10) {
                digits[right] -= 10;
                inc = 1;
            }
            right--;
        }

        if (inc == 1) {
            int[] ints = new int[digits.length + 1];
            ints[0] = inc;
            System.arraycopy(digits, 0, ints, 1, digits.length);
            return ints;
        }
        return digits;
    }
}

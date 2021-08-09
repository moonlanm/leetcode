package net.moon.每日一题;

import java.util.Arrays;

/**
 * @author moonlan
 * date 2021/5/6 9:44
 */
@SuppressWarnings(value = "unused")
public class _5_6_Main {
    public static void main(String[] args) {
        _5_6_Main main = new _5_6_Main();
        System.out.println(Arrays.toString(main.decode(new int[]{1, 2, 3}, 1)));
        System.out.println(Arrays.toString(main.decode(new int[]{6,2,7,3}, 4)));
        System.out.println(Arrays.toString(main.decode(new int[]{6,2}, 4)));
    }

    // encoded = [1,2,3], first = 1
    // [1,0,2,1]
    public int[] decode(int[] encoded, int first) {
        int[] ints = new int[encoded.length + 1];
        ints[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            // i = 0, 0 = 1 ^ 1
            ints[i + 1] = encoded[i] ^ ints[i];
        }
        return ints;
    }
}

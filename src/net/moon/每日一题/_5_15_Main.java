package net.moon.每日一题;

import java.util.HashMap;
import java.util.Map;

/**
 * @author moonlan
 * date 2021/5/15 17:22
 */
@SuppressWarnings(value = "unused")
public class _5_15_Main {

    private final Map<String, Integer> map = new HashMap<>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    public static void main(String[] args) {
        _5_15_Main main = new _5_15_Main();
        System.out.println(main.romanToInt("III"));
    }

    public int romanToInt(String s) {
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 <= chars.length && map.get("" + chars[i]) >= map.get("" + chars[i + 1])) {
                sum += chars[i];
            } else {
                sum -= chars[i];
            }
        }
        return sum;
    }

}

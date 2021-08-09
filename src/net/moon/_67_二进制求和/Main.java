package net.moon._67_二进制求和;



/**
 * @author moonlan
 * date 2021/5/6 16:57
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().addBinary("11", "1"));
        System.out.println(new Main().addBinary("1010", "1011"));
        System.out.println(new Main().addBinary("1111", "1111"));
        System.out.println(new Main().addBinary("0", "0"));
    }

    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aIndex = aChars.length - 1;
        int bIndex = bChars.length - 1;
        int inc = 0;
        StringBuilder builder = new StringBuilder();
        while (aIndex >= 0 && bIndex >= 0) {
            int aInt = aChars[aIndex] - 48;
            int bInt = bChars[bIndex] - 48;
            int sum = aInt + bInt + inc;
            inc = 0;
            switch (sum) {
                case 0, 1 -> builder.append(sum);
                case 2 -> {
                    builder.append(0);
                    inc = 1;
                }
                case 3 -> {
                    builder.append(1);
                    inc = 1;
                }
            }

            aIndex--;
            bIndex--;
        }

        while (aIndex >= 0) {
            int sum = aChars[aIndex--] - 48 + inc;
            inc = 0;
            switch (sum) {
                case 0, 1 -> builder.append(sum);
                case 2 -> {
                    builder.append(0);
                    inc = 1;
                }
                case 3 -> {
                    builder.append(1);
                    inc = 1;
                }
            }
        }

        while (bIndex >= 0) {
            int sum = bChars[bIndex--] - 48 + inc;
            inc = 0;
            switch (sum) {
                case 0, 1 -> builder.append(sum);
                case 2 -> {
                    builder.append(0);
                    inc = 1;
                }
                case 3 -> {
                    builder.append(1);
                    inc = 1;
                }
            }
        }
        if (inc == 1) {
            builder.append(inc);
        }
        return builder.reverse().toString();
    }


}
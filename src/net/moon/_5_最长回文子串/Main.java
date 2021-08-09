package net.moon._5_最长回文子串;

/**
 * @author moonlan
 * date 2021/5/25 10:30
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().longestPalindrome("baaabd"));
    }

    public String longestPalindrome(String s) {
        int[] arr = new int[2];
        char[] chars = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // 获取当前索引
            int high = i, low = i;
            // 判断从当前开始，往右遍历是否是完全相同的字符，如果是则继续向右遍历
            while (high < n - 1 && chars[i] == chars[high + 1]) {
                high++;
            }
            // 将重复字符全部包裹进回文串中，直接跳到重复的最后一个字符后面的一个字符
            i = high;
            // 从当前字符的左边一个和右边一个开始，向两边遍历，看是否是回文串，如果是则继续向两边遍历
            while (low - 1 >= 0 && high + 1 < n && chars[low - 1] == chars[high + 1]) {
                high++;
                low--;
            }
            // 看当前获取的回文串的长度是否是大于已经记录下的回文串的长度，如果是，则替换
            if (high - low > arr[1] - arr[0]) {
                arr[0] = low;
                arr[1] = high;
            }
        }
        return s.substring(arr[0], arr[1] + 1);
    }
}

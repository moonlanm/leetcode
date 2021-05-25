package net.moon._28_实现strStr函数;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/**
 * @author moonlan
 * date 2021/4/27 9:01
 * 实现strStr()函数。
 * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
 * 说明：
 * 当needle是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当needle是空字符串时我们应当返回 0 。这与 C 语言的strstr()以及 Java 的indexOf()定义相符。
 * 示例 1：
 * 输入：haystack = "hello", needle = "ll"
 * 输出：2
 * 示例 2：
 * 输入：haystack = "aaaaa", needle = "bba"
 * 输出：-1
 * 示例 3：
 * 输入：haystack = "", needle = ""
 * 输出：0
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
@SuppressWarnings(value = "unused")
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().strStr2("mississippi", "issip"));
        System.out.println(new Main().strStr2("hello", "ll"));
        System.out.println(new Main().strStr2("mississippi", "issi"));
        System.out.println(new Main().strStr2("aaa", "aaaa"));
        System.out.println(new Main().strStr2("a", "a"));
        long millis = System.currentTimeMillis();
    }

    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        for (int i = 0; i + m <= n; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }
    public int strStr2(String haystack, String needle) {
        int p = 0;
        int hayLen = haystack.length();
        int needleLen = needle.length();
        if (needleLen == 0) {
            return 0;
        }

        for (int i = 0; i < hayLen; i++) {
            while (p < needleLen && (i + p) < hayLen && haystack.charAt(i + p) == needle.charAt(p)) {
                p++;
            }

            if (p == needleLen) {
                return i;
            }

            p = 0;
        }

        return -1;
    }
}

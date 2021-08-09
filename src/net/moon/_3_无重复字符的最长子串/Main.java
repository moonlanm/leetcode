package net.moon._3_无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author moonlan
 * date 2021/5/17 10:57
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)){
                // 将开始指针移动到曾经遇到过的字符的后面一个，这样目前所在的字符串中就不存在重复字符了
                // |为开始指针，/为结束指针
                // p w w k e w
                // | /           2
                // |   /         遇到重复字符
                //    |/         将开始指针移动到第一个w的后面  1
                //     | /       2
                //     |  /      3
                //       |   /   遇到重复字符移动到更新的w的后面 3
                // 结束遍历

                start = Math.max(map.get(ch)+1,start);
            }
            // 当前所得的子串长度与之前记录下的最长子串长度相比较，取大
            max = Math.max(max,end - start + 1);
            // 更新或添加已经遇到过的字符的索引
            map.put(ch,end);
        }
        return max;
    }

}

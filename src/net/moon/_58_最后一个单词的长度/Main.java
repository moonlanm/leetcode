package net.moon._58_最后一个单词的长度;

/**
 * @author moonlan
 * date 2021/5/6 16:28
 */
@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().lengthOfLastWord("Hello World"));
        System.out.println(new Main().lengthOfLastWord(" "));
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        String last = strings[strings.length - 1];
        return last.length();
    }
}

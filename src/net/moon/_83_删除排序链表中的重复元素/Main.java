package net.moon._83_删除排序链表中的重复元素;

import java.util.StringJoiner;

/**
 * @author moonlan
 * date 2021/5/22 15:37
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return new StringJoiner(", ", ListNode.class.getSimpleName() + "[", "]")
                .add("val=" + val)
                .add("next=" + next)
                .toString();
    }
}

@SuppressWarnings(value = "unused")
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        System.out.println(new Main().deleteDuplicates(head));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(1);
        System.out.println(new Main().deleteDuplicates(head2));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode cur = head.next;
        ListNode pre = head;

        while (cur != null) {
            if (pre.val == cur.val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            if (pre != null) {
                cur = pre.next;
            } else {
                cur = null;
            }
        }

        return head;
    }
}

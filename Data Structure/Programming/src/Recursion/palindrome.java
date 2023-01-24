package Recursion;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class palindrome {
    public int length(ListNode l) {
        int len = 1;
        if (l == null)
            return (0);
        while (l.next != null) {
            l = l.next;
            len++;
        }
        return (len);
    }

    public boolean isPalindrome(ListNode head) {
        int len = length(head);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len / 2; i++) {
            stack.push(head.val);
            head = head.next;
        }
        if (len % 2 == 1)
            head = head.next;
        while (head != null) {
            if (head.val == stack.pop())
                head = head.next;
            else
                return (false);
        }
        return (true);
    }
}

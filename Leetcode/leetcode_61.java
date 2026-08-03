package Leetcode;

public class leetcode_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k < 0) {
            return head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            length++;
            last = last.next;
        }
        int rotations = k % length;
        int skip = length - rotations;
        ListNode prev = head;
        for (int i = 0; i < skip - 1; i++) {
            prev = prev.next;
        }
        last.next = head;
        head = prev.next;
        prev.next = null;
        return head;
    }
}

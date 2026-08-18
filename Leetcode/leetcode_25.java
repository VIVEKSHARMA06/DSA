package Leetcode;

public class leetcode_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        while (true) {
            ListNode temp = current;
            for (int i = 0; i < k; i++) {
                if (temp == null)
                    return head;
                temp = temp.next;
            }
            ListNode last = prev;
            ListNode newEnd = current;

            ListNode next = null;

            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;
            prev = newEnd;
            if (current == null) {
                break;
            }
        }
        return head;
    }
}

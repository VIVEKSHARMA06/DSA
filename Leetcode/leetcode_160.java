package Leetcode;

public class leetcode_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        int l1 = 0;
        int l2 = 0;

        while (a != null || b != null) {
            if (a != null) {
                l1++;
                a = a.next;
            }
            if (b != null) {
                l2++;
                b = b.next;
            }
        }

        a = headA;
        b = headB;

        if (l1 > l2) {
            for (int i = 0; i < l1 - l2; i++) {
                a = a.next;
            }
        } else {
            for (int i = 0; i < l2 - l1; i++) {
                b = b.next;
            }
        }

        while (a != b) {
            a = a.next;
            b = b.next;
        }

        return a;
    }
}

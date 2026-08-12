package Leetcode;


public class leetcode_234 {
    // public boolean isPalindrome(ListNode head) {
    // ListNode mid = head;
    // ListNode first = head;
    // while (first != null && first.next != null) {
    // first = first.next.next;
    // mid = mid.next;
    // }
    // Stack<Integer> st = new Stack<>();
    // if (first==null) {
    // first = head;
    // while (first != mid) {
    // st.push(first.val);
    // first = first.next;
    // }
    // } else {
    // first=head;
    // while (first != mid.next) {
    // st.push(first.val);
    // first = first.next;
    // }
    // }
    // while (mid != null) {
    // if (mid.val == st.peek()) {
    // st.pop();
    // mid = mid.next;
    // } else {
    // return false;
    // }
    // }

    // return true;
    // }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);
        ListNode reverseHead = secondHead;
        while (head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseList(reverseHead);
        return (head == null || secondHead == null);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode next = head.next;
        while (head != null) {
            head.next = prev;
            prev = head;
            head = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}

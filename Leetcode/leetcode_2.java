package Leetcode;

public class leetcode_2 {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode head = new ListNode();
//         ListNode next = head;
//         int carry = 0;
//         while (l1 != null && l2 !=null) {
//             int sum = l1.val+l2.val+carry;
//             next.next = new ListNode(sum%10);
//             next = next.next;
//             carry = sum/10;
//             l1 = l1.next;
//             l2 = l2.next;
//         }

//         while(l1!=null) {
//             int sum = l1.val+carry;
//             next.next = new ListNode(sum%10);
//             carry = sum/10;
//             next = next.next;
//             l1=l1.next;
//         }

//         while(l2!=null) {
//             int sum = l2.val+carry;
//             next.next = new ListNode(sum%10);
//             carry = sum/10;
//             next = next.next;
//             l2=l2.next;
//         }

//         if (carry > 0) {
//             next.next = new ListNode(carry);
//         }
//         return head.next;
//     }
}

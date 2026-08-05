/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, curr = null;
        int sum = 0, carry = 0;
        while(l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            ListNode temp = new ListNode(sum % 10);
            if(head == null) {
                head = temp;
                curr = temp;
            }
            else {
                curr.next = temp;
                curr = curr.next;
            }
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            sum = l1.val + carry;
            ListNode temp = new ListNode(sum % 10);
            curr.next = temp;
            curr = curr.next;
            carry = sum / 10;
            l1 = l1.next;
        }
        while(l2 != null) {
            sum = l2.val + carry;
            ListNode temp = new ListNode(sum % 10);
            curr.next = temp;
            curr = curr.next;
            carry = sum / 10;
            l2 = l2.next;
        }
        if(carry > 0) {
            ListNode temp = new ListNode(carry);
            curr.next = temp;
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}
